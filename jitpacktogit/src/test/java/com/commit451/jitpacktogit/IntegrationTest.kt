package com.commit451.jitpacktogit

import org.gradle.testkit.runner.GradleRunner
import org.junit.Test
import java.io.File

/**
 * Test the integration
 */
class IntegrationTest {

    val integrationRoot = File("src/test/integration")

    @Test
    fun integrationTests() {
        System.out.println(integrationRoot.absolutePath)
        val runner = GradleRunner.create()
                .withProjectDir(integrationRoot)
                .withPluginClasspath()
                .withArguments("clean", "jitpacktogit", "--stacktrace")

        val result = runner.build()
    }
}