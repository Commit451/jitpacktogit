package com.commit451.jitpacktogit

import org.gradle.api.Project

/**
 * Does the work
 */
object JitPackToGit {

    fun run(project: Project, verbose: Boolean): Result {
        project.configurations.addAll(project.buildscript.configurations)

        val dependencies = project.configurations
                .flatMap {
                    it.allDependencies
                }
                .toMutableSet()
        for (subProject in project.allprojects) {
            //add all subproject configurations
            for (configuration in subProject.configurations) {
                dependencies.addAll(configuration.allDependencies)
            }
            if (verbose) {
                System.out.println("adding configs for subproject ${subProject.name}")
            }
        }

        if (verbose) {
            for (configuration in project.configurations) {
                System.out.println("Configuration: ${configuration.name}")
                for (dependency in configuration.allDependencies) {
                    System.out.println("Dependency: ${dependency.asHumanReadable()}")
                }
            }
        }

        if (verbose) {
            for (dependency in dependencies) {
                System.out.println(dependency.asHumanReadable())
            }
        }

        val result = Result()

        result.jitPackUrls = dependencies.mapNotNull {
            Resolver.resolveToUrl(it.group, it.name)
        }
        return result
    }
}