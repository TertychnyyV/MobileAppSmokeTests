package omcdPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DemoPage {

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private final static String SET_PERMISSION_BUTTON = "//*[contains(@text, 'ПРЕДОСТАВИТЬ')]";
    private final static String SET_PERMISSION_TO_WRITE_BUTTON = "//*[contains(@text, 'РАЗРЕШИТЬ')]";
    private final static String SET_PERMISSION_TO_CALL_BUTTON = "//*[contains(@text, 'РАЗРЕШИТЬ')]";
    private final static String OPEN_SLIDER_BUTTON = "//*[contains(@content-desc, 'Перейти вверх')]";
    private final static String MENU_BUTTON = "//*[contains(@resource-id, 'settingsButton')]";
    private final static String FULL_MODE_BUTTON = "//*[contains(@text, 'Полный режим')]";


    /*--------------------------------METHODS-------------------------------------------------------------*/
    @Step("Перейти в полный режим")
    public DemoPage goToFullMode(){
        $(By.xpath(SET_PERMISSION_BUTTON)).click();
        $(By.xpath(SET_PERMISSION_TO_WRITE_BUTTON)).click();
        $(By.xpath(SET_PERMISSION_TO_CALL_BUTTON)).click();
        $(By.xpath(OPEN_SLIDER_BUTTON)).click();
        $(By.xpath(MENU_BUTTON)).click();
        $(By.xpath(FULL_MODE_BUTTON)).click();
        return page(DemoPage.class);
    }

}
