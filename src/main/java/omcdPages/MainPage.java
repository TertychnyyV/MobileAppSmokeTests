package omcdPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import javax.annotation.Nonnull;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    /*--------------------------------ELEMENTS-------------------------------------------------------------*/
    private static final String OMK_LABEL = "//*[contains(@text, 'ОМК')]";
    private static final String WORKER_NAME = "ru.cdc.optimum.mobilecashdesk:id/userTextView";
    private static final String WORKER_POSITION_ROLE_FIRM = "ru.cdc.optimum.mobilecashdesk:id/additionalInfoTextView";
//    private static final KKT_NAME = "//*[./*[contains(@text, 'Касса')]]";
//    private static final String TERMINAL_NAME = "//*[./*[contains(@text, 'Терминал оплаты')]]";
    private final static String TYPE_OF_FISCAL_DOC = "//*[contains(@text, 'Выберите тип чека')]";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private static final String OPEN_SLIDER_BUTTON = "//*[contains(@content-desc, 'Перейти вверх')]";
    private static final String OPEN_CALENDAR_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/action_filter";
    private static final String OPEN_FIND_STRING_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/action_search";
    private static final String CREATE_FISCAL_DOCUMENTS_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/addRecipeButton";
    private static final String OPEN_KKT_SETTINGS_BUTTON = "//*[./*[contains(@text, 'Касса')]]";
    private static final String OPEN_TERMINAL_SETTINGS_BUTTON = "//*[./*[contains(@text, 'Терминал оплаты')]]";
    private static final String OPEN_MENU_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/settingsButton";
    private static final String FIND_BY_BARCODE_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/scanButton";
    private static final String LOGOUT_BUTTON = "//*contains[@text, 'Выход']";
    private static final String OK_BUTTON = "android:id/button1";
    private static final String CANCEL_BUTTON = "android:id/button2";

    /*----------------------------FISCAL_DOCUMENTS---------------------------------------------------------*/
    private static final String SALE_ORDER = "//*[contains(@text, 'Продажа')]";
    private static final String RETURN_SALE = "//*[contains(@text, 'Возврат продажи')]";
    private static final String PARRISH_CORRECTION = "//*[contains(@text, 'Коррекция прихода')]";
    private static final String FLOW_CORRECTION = "//*[contains(@text, 'Коррекция расхода')]";

    /*--------------------------------METHODS-------------------------------------------------------------*/

    @Step("Ждем загрузки главной страницы ОМК")
    public MainPage waitForMainPageLoad(){
        $(By.xpath(OMK_LABEL));
        return page(MainPage.class);
    }

    @Step("открываем боковой слайдер")
    public MainPage openSlider(){
        $(By.xpath(OPEN_SLIDER_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Открываем строку поиска")
    public MainPage finFiscalDoc(){
        $(By.id(OPEN_FIND_STRING_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Открываем календарь")
    public MainPage openCalendar(){
        $(By.id(OPEN_CALENDAR_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Создаем фискальный документ")
    public MainPage createFiscalDoc(@Nonnull String fiscalDoc){
        $(By.id(CREATE_FISCAL_DOCUMENTS_BUTTON)).click();
        switch (fiscalDoc.toLowerCase()){
            case "продажа":
                $(By.xpath(SALE_ORDER)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "возврат":
                $(By.xpath(RETURN_SALE)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "коррекция прихода":
                $(By.xpath(PARRISH_CORRECTION)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "коррекция расхода":
                $(By.xpath(FLOW_CORRECTION)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            default:
                System.out.println("Такого типа документов нет либо не выбрано значение, " +
                                    "выходим из создания фискального документа");
                $(By.id(CANCEL_BUTTON)).click();
                break;
        }
        return page(MainPage.class);
    }

    /*-------------------------SLIDER-METHODS-------------------------------------------------------------*/

    @Step("Преходим в настройки терминала")
    public MainPage goToTerminalSettings(){
        $(By.xpath(OPEN_TERMINAL_SETTINGS_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Переходим в настройки ККТ")
    public MainPage goToKktSettings(){
        $(By.xpath(OPEN_KKT_SETTINGS_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Переходим в настройки")
    public MainPage goToSettings(){
        $(By.id(OPEN_MENU_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Выходим из аккаунта сотрудника")
    public MainPage logout(){
        $(By.xpath(LOGOUT_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("Переходим в поиск чека по штрих коду")
    public MainPage findByScan(){
        $(By.id(FIND_BY_BARCODE_BUTTON)).click();
        return page(MainPage.class);
    }


}
