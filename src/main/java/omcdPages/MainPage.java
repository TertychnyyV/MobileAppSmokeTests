package omcdPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    /*--------------------------------ELEMENTS-------------------------------------------------------------*/
    private final static String OMK_LABEL = "//*[contains(@text, 'ОМК')]";
    private final static String WORKER_NAME = "*//*[contains(@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/userTextView')]";
    private final static String WORKER_POSITION_ROLE_FIRM = "//*contains[@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/additionalInfoTextView']";
//    private final static String KKT_NAME =
//    private final static String TERMINAL_NAME =
    private final static String TYPE_OF_FISCAL_DOC = "//*[contains(@text, 'Выберите тип чека')]";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private final static String OPEN_SLIDER_BUTTON = "//*[contains(@content-desc, 'Перейти вверх')]";
    private final static String OPEN_CALENDAR_BUTTON = "//*[contains(@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/action_filter')]";
    private final static String OPEN_FIND_STRING_BUTTON = "//*[contains(@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/action_search')]";
    private final static String CREATE_FISCAL_DOCUMENTS_BUTTON = "//*[contains(@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/addRecipeButton')]";
//    private final static String OPEN_KKT_SETTINGS_BUTTON =
//    private final static String OPEN_TERMINAL_SETTINGS_BUTTON =
    private final static String OPEN_MENU_BUTTON = "//*[contains(@resource-id, 'ru.cdc.optimum.mobilecashdesk:id/settingsButton')]";
    private final static String FIND_BY_BARCODE_BUTTON = "//*[contains(resource-id, 'ru.cdc.optimum.mobilecashdesk:id/scanButton')]";
    private final static String LOGOUT_BUTTON = "//*contains[@text, 'Выход']";
    private final static String OK_BUTTON = "//*[contains(@resource-id, 'android:id/button1')]";
    private final static String CANCEL_BUTTON = "//*[contains(@resource-id, 'android:id/button2')]";

    /*----------------------------FISCAL_DOCUMENTS---------------------------------------------------------*/
    private final static String SALE_ORDER = "//*[contains(@text, 'Продажа')]";
    private final static String RETURN_SALE = "//*[contains(@text, 'Возврат продажи')]";
    private final static String PARRISH_CORRECTION = "//*[contains(@text, 'Коррекция прихода')]";
    private final static String FLOW_CORRECTION = "//*[contains(@text, 'Коррекция расхода')]";

    /*--------------------------------METHODS-------------------------------------------------------------*/

    @Step("Ждем загрузки главной страницы ОМК")
    public MainPage waitForMainPageLoad(){
        $(By.xpath(OMK_LABEL));
        return page(MainPage.class);
    }
}
