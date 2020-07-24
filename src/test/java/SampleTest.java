import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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
}
