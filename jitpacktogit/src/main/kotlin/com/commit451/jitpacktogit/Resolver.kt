package com.commit451.jitpacktogit

/**
 * Resolves dependencies to their urls
 */
object Resolver {

    val PATH = "https://github.com/{group}/{name}"

    fun resolveToUrl(dependencyGroup: String, dependencyName: String): String? {
        val split = dependencyGroup.split("com.github.")
        if (split.size < 2){
            return null
        }
        val group = split[1]
        var url = PATH.replace("{group}", group)
        url = url.replace("{name}", dependencyName)
        return url
    }
}