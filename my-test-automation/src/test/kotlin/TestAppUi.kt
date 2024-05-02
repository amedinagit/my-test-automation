import org.testng.Assert
import org.testng.annotations.Test
import pageObjects.LoginPageObject

class TestAppUi: TestBase() {
    private val loginPg = LoginPageObject()

    @Test
    fun loginPageTest() {
        loginPg.loginText.isDisplayed
        //Assert.assertTrue(loginPg.loginText.isDisplayed, "log in page is not visible")
    }
}