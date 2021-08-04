package omcdPages;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class LoginPage {

    /*--------------------------------DRIVER-------------------------------------------------------------*/
    /*--------------------------------VALUES-------------------------------------------------------------*/
    private static final String LOGIN = "1002822";
    private static final String PASSWORD = "it2rd6we";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private static final String SETTING_BUTTON = "//*[contains(@content-desc, '?????????')]";
    private static final String LOGIN_FIELD = "ru.cdc.optimum.mobilecashdesk:id/editLogin";
    private static final String PASSWORD_FIELD = "ru.cdc.optimum.mobilecashdesk:id/editPassword";
    private static final String ENTER_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/buttonLogin";

    /*--------------------------------METHODS-------------------------------------------------------------*/
    @Step("??????? ? ?????????")
    public LoginPage goToSetting() {
        $(By.xpath(SETTING_BUTTON)).click();
        return page(LoginPage.class);
    }

    @Step("?????? ?????")
    public LoginPage enterLogin() {
        $(By.id(LOGIN_FIELD)).click();
        $(By.id(LOGIN_FIELD)).setValue(LOGIN);
        return page(LoginPage.class);
    }

    @Step("?????? ??????")
    public LoginPage enterPassword() {
        $(By.id(PASSWORD_FIELD)).click();
        $(By.id(PASSWORD_FIELD)).setValue(PASSWORD);
        return page(LoginPage.class);
    }

    @Step("?????? ?????? ????")
    public LoginPage pushEnterButton() {
        swipeUp();
        $(By.id(ENTER_BUTTON)).click();
        return page(LoginPage.class);
    }

    public LoginPage goToLogin(){
        SettingsPage settingsPage = page(SettingsPage.class);
        goToSetting();
        settingsPage.setIpAddress();
        settingsPage.setPort();
        settingsPage.goToLoginPage();
        enterLogin();
        enterPassword();
        swipeUp();
        pushEnterButton();
        return page(LoginPage.class);
    }
    /*--------------------------------PROTECTED_METHODS--------------------------------------------------*/
    @Step("?????? ????? ?????")
    protected LoginPage swipeUp() {
        WebDriver driver = getWebDriver();

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        Dimension size = driver.manage().window().getSize();
        PointOption pointStart = PointOption.point(size.width / 2, (int) (size.height * 0.5));
        PointOption pointEnd = PointOption.point(size.width / 2, (int) (size.height * 0.2));
        action.press(pointStart).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(pointEnd).release().perform();
        return page(LoginPage.class);
    }
}
