package utils

import java.io.FileInputStream
import java.io.IOException
import java.util.Properties

open class CommonUtils {
    var properties: Properties? = null

    companion object {
        const val AUTOMATION_NAME = "automationName"
        const val PLATFORM_NAME = "platformName"
    }

    fun loadProperties(): Properties {
        try {
            properties = Properties()
            properties?.load(FileInputStream(System.getProperty("user.dir") + "/src/main/resources/global.properties"))
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        return properties!!
    }
}