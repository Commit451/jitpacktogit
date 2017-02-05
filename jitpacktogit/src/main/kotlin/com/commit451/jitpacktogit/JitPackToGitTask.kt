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
        val result = JitPackToGit.run(project)

        if (result.jitPackUrls.isEmpty()) {
            System.out.println("\nNo JitPack URLs found in project")
        } else {
            System.out.println("\nJitPack URLs:\n")
            for (url in result.jitPackUrls) {
                System.out.println(url)
            }
        }

    }
}