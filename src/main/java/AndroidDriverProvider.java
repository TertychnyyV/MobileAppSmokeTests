
import java.net.MalformedURLException;
import java.net.URL;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;

public class AndroidDriverProvider implements WebDriverProvider {

    /*---------------------------VALUES-------------------------------------------------------------------------------*/

    private static final String VERSION = "9";
    private static final String DEVICE_NAME = "REDMI 7A";
    private static final String PATH_TO_APP = "C://Users/tertychnyy/IdeaProjects/AppiumAndroidTest/apks/app-googleplay-debug.apk";
    private static final String PACKAGE_NAME = "ru.cdc.optimum.mobilecashdesk";
    private static final String ACTIVITY_NAME = "ru.cdc.optimum.mobilecashdesk.ui.activity.CDCLoginActivity";


    @Nonnull
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability(MobileCapabilityType.VERSION, VERSION);
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", DEVICE_NAME);
        capabilities.setCapability("app", PATH_TO_APP);
        capabilities.setCapability(APP_PACKAGE, PACKAGE_NAME);
        capabilities.setCapability(APP_ACTIVITY, ACTIVITY_NAME);

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
