import com.sendhil.buildsrc.androidApplicationConfig
import org.jetbrains.kotlin.config.KotlinCompilerVersion
import com.sendhil.buildsrc.Libraries

plugins {
    id("com.android.application")
    id("com.sendhil.buildsrc")
}

androidApplicationConfig(com.sendhil.buildsrc.Versions.applicationId)

dependencies {
    implementation(Libraries.appcompat)
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
