package pageObjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory
import utils.AppiumDriverUtils
import utils.CommonUtils
import java.util.Properties

class LoginPageObject: BasePageObject() {
    private var driver: AppiumDriver? = null
    private var props: Properties? = null

    init {
        props = CommonUtils().properties
        driver = AppiumDriverUtils().getDriver(props)
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Log In')]")
    lateinit var loginText: WebElement
}