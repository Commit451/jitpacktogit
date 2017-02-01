package com.commit451.jitpacktogit

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Behold the plugin
 */
class JitpackToGitPlugin : Plugin<Project> {


    override fun apply(project: Project?) {
        project!!.tasks.create("jitpacktogit", JitpackToGitTask::class.java)
    }
}
