package utils

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.Properties

class AppiumDriverUtils {

    companion object {
        private var driver: AppiumDriver? = null
        private var url: URL? = null
    }

    private fun setCapabilities(prop: Properties?): DesiredCapabilities {
        val props = CommonUtils().loadProperties()
        val caps = DesiredCapabilities()
        url = URL(props.getProperty("appium_url").toString())

        caps.setCapability("deviceType", "AndroidDevice")
        caps.setCapability(CommonUtils.PLATFORM_NAME, props.getProperty("capabilities.platformName"))
        //caps.setCapability("platformName", "android")
        caps.setCapability("appium:automationName", "uiautomator2")

        return caps
    }

    fun getDriver(props: Properties?): AppiumDriver {
        val caps: DesiredCapabilities = setCapabilities(props)

        driver = AppiumDriver(url, caps)

        return driver as AppiumDriver
    }
}