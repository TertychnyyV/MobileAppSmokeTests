import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SettingsPage;
import pages.demoPage;

import static com.codeborne.selenide.Selenide.page;


public class SampleTest extends BaseTest {

    @Test
    @Tag("UI")
    @Severity(SeverityLevel.MINOR)
    @Description("����� �� ���� ������ � ������ �����")
    @Step("������ ���������� ��� ���������� / ��������� � ���� / ��������� ���������� � '������ �����'")
    void goToFullModeTest() {
        demoPage page = page(demoPage.class);
        page.goToFullMode();
    }

    @Test
    @Tag("UI")
    @Severity(SeverityLevel.MINOR)
    @Description("����� �� ���� ������ � ������ �����")
    @Step("������ ���������� ��� ���������� / ��������� � ���� " +
            "/ ��������� ���������� � '������ �����' / ��������� ��� �����������")
    void login() {
        LoginPage loginPage = page(LoginPage.class);
        SettingsPage settingsPage = page(SettingsPage.class);
        //goToFullModeTest();
        loginPage.goToSetting();
        settingsPage.setIpAddress();
        settingsPage.setPort();
        settingsPage.goToLoginPage();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.pushEnterButton();

    }
}
