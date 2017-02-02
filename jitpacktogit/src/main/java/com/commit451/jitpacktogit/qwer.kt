package com.commit451.jitpacktogit

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Behold the plugin
 */
class qwer : Plugin<Project> {

    override fun apply(project: Project?) {
        project!!.tasks.create("jitpacktogit", asdf::class.java)
    }
}
