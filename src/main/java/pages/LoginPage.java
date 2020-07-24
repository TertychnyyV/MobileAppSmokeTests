package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    /*--------------------------------DRIVER-------------------------------------------------------------*/
    /*--------------------------------VALUES-------------------------------------------------------------*/
    private final static String LOGIN = "1002822";
    private final static String PASSWORD = "it2rd6we";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private final static String SETTING_BUTTON = "//*[contains(@content-desc, 'Настройки')]";
    private final static String LOGIN_FIELD = "ru.cdc.optimum.mobilecashdesk:id/editLogin";
    private final static String PASSWORD_FIELD = "ru.cdc.optimum.mobilecashdesk:id/editPassword";
    private final static String ENTER_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/buttonLogin";

    /*--------------------------------METHODS-------------------------------------------------------------*/
    public LoginPage goToSetting() {
        $(By.xpath(SETTING_BUTTON)).click();
        return page(LoginPage.class);
    }

    public LoginPage enterLogin() {
        $(By.id(LOGIN_FIELD)).click();
        $(By.id(LOGIN_FIELD)).setValue(LOGIN);
        return page(LoginPage.class);
    }

    public LoginPage enterPassword() {
        $(By.id(PASSWORD_FIELD)).click();
        $(By.id(PASSWORD_FIELD)).setValue(PASSWORD);
        return page(LoginPage.class);
    }

    public LoginPage pushEnterButton() {
        swipeUp();
        $(By.id(ENTER_BUTTON)).click();
        return page(LoginPage.class);
    }

    /*--------------------------------PROTECTED_METHODS--------------------------------------------------*/
    /*--------------------------------TO-DO:_MAKE_IT_WORKS!!---------------------------------------------*/
    private AppiumDriver driver;

    public LoginPage swipeUp() {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        PointOption pointStart = PointOption.point(size.width / 2, (int) (size.height * 0.5));
        PointOption pointEnd = PointOption.point(size.width / 2, (int) (size.height * 0.2));
        action.press(pointStart).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(pointEnd).release().perform();
        return page(LoginPage.class);
    }
}
