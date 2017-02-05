package com.commit451.jitpacktogit

import org.junit.Assert
import org.junit.Test

/**
 * Test resolution
 */
class ResolverTest {

    @Test
    fun resolveTest() {
        val group = "com.github.Commit451"
        val name = "ResourcesPoet"
        val resolvedUrl = Resolver.resolveToUrl(group, name)
        Assert.assertEquals("https://github.com/Commit451/ResourcesPoet", resolvedUrl)
    }
}