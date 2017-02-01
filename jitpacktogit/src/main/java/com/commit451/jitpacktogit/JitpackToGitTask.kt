package com.commit451.jitpacktogit

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.SourceTask

/**
 * The task that actually converts things
 */
open class JitpackToGitTask : DefaultTask() {

    init {
        description = "Displays the dependency updates for the project."
        group = "Help"
    }

}