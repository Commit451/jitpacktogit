package com.commit451.jitpacktogit

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * The task that actually converts things
 */
open class JitPackToGitTask : DefaultTask() {

    init {
        description = "Displays the dependency updates for the project."
        group = "Help"
    }

    @TaskAction
    fun jitpacktogit() {
        project.evaluationDependsOnChildren()

        System.out.println("hi")
    }
}