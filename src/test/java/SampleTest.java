import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import omcdPages.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.page;

@Tag("OMK")
@DisplayName("ОМК - основной тест-кейс")
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SampleTest extends BaseTest {
//
//    @Test
//    @Tag("UI")
//    @DisplayName("Переключение с 'Демо режима' на 'Полный режим'")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Выход из демо режима в полный режим")
//    @Step("Выдаем разрешения для приложения / переходим в меню / переводим приложение в 'полный режим'")
//    //@Order(1)
//    void goToFullModeTest() {
//        DemoPage demoPage = page(DemoPage.class);
//        demoPage.goToFullMode();
//    }
//
//    @Test
//    @Tag("UI")
//    @DisplayName("Зайти в приложение под сотрудником")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("В полном режиме ввести логин и пароль сотрудника")
//    @Step("Логинемся под сотрудником")
//    //@Order(2)
//    void loginTest() {
//        LoginPage loginPage = page(LoginPage.class);
//        SettingsPage settingsPage = page(SettingsPage.class);
//        loginPage.goToSetting();
//        settingsPage.setIpAddress();
//        settingsPage.setPort();
//        settingsPage.goToLoginPage();
//        loginPage.enterLogin();
//        loginPage.enterPassword();
//        loginPage.pushEnterButton();
//    }

    @Test
    @Tag("UI")
    @DisplayName("Проверка ввода пинкода")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ввод и подтверждение чертырех значного пинкода")
    //@Order(3)
    void enterPin() {
        PinCodePage pinPage = page(PinCodePage.class);
        MainPage mainPage = page(MainPage.class);
        DemoPage demoPage = page(DemoPage.class);
        LoginPage loginPage = page(LoginPage.class);
        demoPage.goToFullMode();
        loginPage.goToLogin();
        pinPage.enterPin();
        pinPage.enterPin();
        mainPage.waitForMainPageLoad();
        mainPage.createFiscalDoc("возврат");

    }


}
