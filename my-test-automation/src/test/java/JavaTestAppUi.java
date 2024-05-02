import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.JavaLoginPageObject;

import java.io.IOException;

public class JavaTestAppUi extends JavaBase{

    @Test
    public void loginTest() throws IOException {
        AppiumDriver driver = capabilities();

        //TouchAction is deprecated:
        //PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        //Sequence tap = new Sequence(finger, 1);

        JavaLoginPageObject javaLogin = new JavaLoginPageObject(driver);

        Assert.assertTrue(javaLogin.login.isDisplayed(), "log in page is not visible");

    }
}
