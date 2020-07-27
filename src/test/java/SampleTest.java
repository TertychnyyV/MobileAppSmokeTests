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
@DisplayName("��� - �������� ����-����")
public class SampleTest extends BaseTest {

    @Test
    @Tag("UI")
    @DisplayName("������������ � '���� ������' �� '������ �����'")
    @Severity(SeverityLevel.MINOR)
    @Description("����� �� ���� ������ � ������ �����")
    @Step("������ ���������� ��� ���������� / ��������� � ���� / ��������� ���������� � '������ �����'")
    void goToFullModeTest() {
        DemoPage demoPage = page(DemoPage.class);
        demoPage.goToFullMode();
    }

    @Test
    @Tag("UI")
    @DisplayName("����� � ���������� ��� �����������")
    @Severity(SeverityLevel.MINOR)
    @Description("� ������ ������ ������ ����� � ������ ����������")
    @Step("��������� ��� �����������")
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
