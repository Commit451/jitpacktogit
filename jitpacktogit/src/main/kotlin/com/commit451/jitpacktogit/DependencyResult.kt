package com.commit451.jitpacktogit

import org.gradle.api.artifacts.Dependency

/**
 * The dependency and its URL
 */
data class DependencyResult(val url: String, val dependency: Dependency) {

    override fun hashCode(): Int {
        return url.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is DependencyResult) {
            return false
        }
        return url == other.url
    }
}