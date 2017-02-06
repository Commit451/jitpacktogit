package com.commit451.jitpacktogit

/**
 * Resolves dependencies to their urls
 */
object Resolver {

    val PATH = "https://github.com/{group}/{name}"

    fun resolveToUrl(dependencyGroup: String, dependencyName: String): String? {
        val split = dependencyGroup.split(".")
        if (split.size < 3 || !dependencyGroup.contains("com.github")){
            return null
        }
        val group = split[2]
        val name: String
        if (split.size == 3) {
            name = dependencyName
        } else if (split.size == 4) {
            name = split[3]
        } else {
            return null
        }
        var url = PATH.replace("{group}", group)
        url = url.replace("{name}", name)
        return url
    }
}