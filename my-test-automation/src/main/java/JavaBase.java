import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class JavaBase {
    static AppiumDriver driver;

    public static AppiumDriver capabilities() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/global.properties");
        Properties prop = new Properties();
        prop.load(fis);

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("autoLaunch", false);

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }
}
