import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SettingsPage;
import pages.DemoPage;

import static com.codeborne.selenide.Selenide.page;

@Tag("OMK")
@DisplayName("ОМК - основной тест-кейс")
public class SampleTest extends BaseTest {

    @Test
    @Tag("UI")
    @DisplayName("Переключение с 'Демо режима' на 'Полный режим'")
    @Severity(SeverityLevel.MINOR)
    @Description("Выход из демо режима в полный режим")
    @Step("Выдаем разрешения для приложения / переходим в меню / переводим приложение в 'полный режим'")
    void goToFullModeTest() {
        DemoPage demoPage = page(DemoPage.class);
        demoPage.goToFullMode();
    }

    @Test
    @Tag("UI")
    @DisplayName("Зайти в приложение под сотрудником")
    @Severity(SeverityLevel.MINOR)
    @Description("В полном режиме ввести логин и пароль сотрудника")
    @Step("Логинемся под сотрудником")
    void login() {
        LoginPage loginPage = page(LoginPage.class);
        SettingsPage settingsPage = page(SettingsPage.class);
        loginPage.goToSetting();
        settingsPage.setIpAddress();
        settingsPage.setPort();
        settingsPage.goToLoginPage();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.pushEnterButton();

    }


}
