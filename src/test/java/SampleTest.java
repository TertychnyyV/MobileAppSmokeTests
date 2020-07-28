import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.PinCodePage;
import pages.SettingsPage;
import pages.DemoPage;

import static com.codeborne.selenide.Selenide.page;

@Tag("OMK")
@DisplayName("��� - �������� ����-����")
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SampleTest extends BaseTest {

    @Test
    @Tag("UI")
    @DisplayName("������������ � '���� ������' �� '������ �����'")
    @Severity(SeverityLevel.NORMAL)
    @Description("����� �� ���� ������ � ������ �����")
    @Step("������ ���������� ��� ���������� / ��������� � ���� / ��������� ���������� � '������ �����'")
    //@Order(1)
    void goToFullModeTest() {
        DemoPage demoPage = page(DemoPage.class);
        demoPage.goToFullMode();
    }

    @Test
    @Tag("UI")
    @DisplayName("����� � ���������� ��� �����������")
    @Severity(SeverityLevel.NORMAL)
    @Description("� ������ ������ ������ ����� � ������ ����������")
    @Step("��������� ��� �����������")
    //@Order(2)
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

    @Test
    @Tag("UI")
    @DisplayName("�������� ����� �������")
    @Severity(SeverityLevel.NORMAL)
    @Description("���� � ������������� �������� �������� �������")
    //@Order(3)
    void enterPin() {
        PinCodePage pinpage = page(PinCodePage.class);
        pinpage.enterPin();
        pinpage.enterPin();

    }


}
