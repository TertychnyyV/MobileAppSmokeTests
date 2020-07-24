import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.demoPage;

import static com.codeborne.selenide.Selenide.page;

public class SampleTest extends BaseTest {

    @Test
    @Description("Выход из демо режима в полный режим")
    void goToFullModeTest() {
        demoPage page = page(demoPage.class);
        page.goToFullMode();
    }
}
