package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SettingsPage {

    /*--------------------------------VALUES-------------------------------------------------------------*/
    private final static String IP_ADDRESS = "91.107.71.2";
    private final static String PORT = "11127";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private final static String SET_IP_BUTTON = "//*[./*[contains(@text, 'Адрес сервера')]]";
    private final static String SET_PORT_BUTTON = "//*[./*[contains(@text, 'Порт')]]";
    private final static String INPUT_FIELD = "android:id/edit";
    private final static String OK_BUTTON = "android:id/button1";
    private final static String GO_TO_LOGIN_SCREEN = "//*[contains(@content-desc, 'Перейти вверх')]";

    /*--------------------------------METHODS-------------------------------------------------------------*/

    @Step("Ввести адресс сервера")
    public SettingsPage setIpAddress(){
        $(By.xpath(SET_IP_BUTTON)).click();
        $(By.id(INPUT_FIELD)).setValue(IP_ADDRESS);
        $(By.id(OK_BUTTON)).click();
        return page(SettingsPage.class);
    }

    @Step("Ввести порт")
    public SettingsPage setPort() {
        $(By.xpath(SET_PORT_BUTTON)).click();
        $(By.id(INPUT_FIELD)).setValue(PORT);
        $(By.id(OK_BUTTON)).click();
        return page(SettingsPage.class);
    }

    @Step("Выйти из настроек")
    public SettingsPage goToLoginPage() {
        $(By.xpath(GO_TO_LOGIN_SCREEN)).click();
        return page(SettingsPage.class);
    }
}
