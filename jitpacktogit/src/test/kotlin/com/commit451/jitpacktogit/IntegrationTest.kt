package com.commit451.jitpacktogit

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.testkit.runner.GradleRunner
import org.junit.Assert
import org.junit.Test
import java.io.File

/**
 * Test the integration
 * @see <a href="https://docs.gradle.org/current/userguide/custom_plugins.html#sec:writing_tests_for_your_plugin">https://docs.gradle.org/current/userguide/custom_plugins.html#sec:writing_tests_for_your_plugin</a>
 */
class IntegrationTest {

    val integrationRoot = File("src/test/integration")

    @Test
    fun pluginFoundTest() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.commit451.jitpacktogit")
        val task = project.tasks.getByName("jitpacktogit")
        Assert.assertTrue(task is JitPackToGitTask)
    }

    @Test
    fun integrationTests() {

        val runner = GradleRunner.create()
                .withProjectDir(integrationRoot)
                .withPluginClasspath()
                .withArguments("jitpacktogit", "-Dverbose=true", "--stacktrace")

        val result = runner.build()
        System.out.println(result.output)
        Assert.assertTrue(result.output.contains("ResourcesPoet"))
    }
}