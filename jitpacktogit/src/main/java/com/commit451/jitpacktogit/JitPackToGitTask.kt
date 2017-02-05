package com.commit451.jitpacktogit

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * The task that actually converts things
 */
open class JitPackToGitTask : DefaultTask() {

    init {
        description = "Shows your JitPack dependencies as their Git URLs"
        group = "Help"
    }

    @TaskAction
    fun jitpacktogit() {
        project.evaluationDependsOnChildren()
        project.configurations.addAll(project.buildscript.configurations)

        val dependencies = project.configurations
                .flatMap { it.allDependencies }
                .toSet()

        val jitpackUrls = dependencies.mapNotNull {
            Resolver.resolveToUrl(it.group, it.name)
        }

        if (jitpackUrls.isEmpty()) {
            System.out.println("\nNo JitPack URLs found in project")
        } else {
            System.out.println("\nJitPack URLs:\n")
            for (url in jitpackUrls) {
                System.out.println(url)
            }
        }

    }
}