import listeners.Listeners
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import utils.AppiumDriverUtils
import utils.CommonUtils

open class TestBase : CommonUtils() {
    private val props = CommonUtils().properties
    private val driver = AppiumDriverUtils().getDriver(props)

    @BeforeMethod
    fun testSetup() {

    }

    @AfterMethod
    fun testCleanup() {
        driver.quit()
    }
}