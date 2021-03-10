package com.sendhil.buildsrc

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


open class BuildSrcPlugin : Plugin<Project> {
    private val Project.android: BaseExtension
        get() = extensions.findByName("android") as? BaseExtension
            ?: error("Not an Android module: $name")

    override fun apply(project: Project) =
        with(project) {
            applyPlugins()
            dependenciesConfig()
        }

    private fun Project.applyPlugins() {
        plugins.run {
            apply("kotlin-android")
            apply("kotlin-android-extensions")
        }
    }

    private fun Project.dependenciesConfig() {
        dependencies {
            kotlinProject()
            unitTestDependencies()
            androidTestDependencies()
        }
    }
}
