package com.commit451.jitpacktogit

import org.gradle.api.Project

/**
 * Does the work
 */
object JitPackToGit {

    fun run(project: Project): Result {
        project.configurations.addAll(project.buildscript.configurations)

        val dependencies = project.configurations
                .flatMap { it.allDependencies }
                .toSet()

        val result = Result()

        result.jitPackUrls = dependencies.mapNotNull {
            Resolver.resolveToUrl(it.group, it.name)
        }
        return result
    }
}