package com.commit451.jitpacktogit

import org.gradle.api.artifacts.Dependency

/**
 * Extensions for Dependency
 */

/**
 * print a dependency in a human readable way
 */
fun Dependency.asHumanReadable(): String {
    return "Group: $group Name: $name Version: $version"
}
