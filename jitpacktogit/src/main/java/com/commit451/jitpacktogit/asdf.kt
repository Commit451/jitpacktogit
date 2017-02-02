package com.commit451.jitpacktogit

import org.gradle.api.DefaultTask

/**
 * The task that actually converts things
 */
open class asdf : DefaultTask() {

    init {
        description = "Displays the dependency updates for the project."
        group = "Help"
    }

}