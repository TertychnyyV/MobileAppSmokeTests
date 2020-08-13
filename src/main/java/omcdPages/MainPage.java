package omcdPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import javax.annotation.Nonnull;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    /*--------------------------------ELEMENTS-------------------------------------------------------------*/
    private final static String OMK_LABEL = "//*[contains(@text, '���')]";
    private final static String WORKER_NAME = "ru.cdc.optimum.mobilecashdesk:id/userTextView";
    private final static String WORKER_POSITION_ROLE_FIRM = "ru.cdc.optimum.mobilecashdesk:id/additionalInfoTextView";
//    private final static String KKT_NAME = "//*[./*[contains(@text, '�����')]]";
//    private final static String TERMINAL_NAME = "//*[./*[contains(@text, '�������� ������')]]";
    private final static String TYPE_OF_FISCAL_DOC = "//*[contains(@text, '�������� ��� ����')]";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private final static String OPEN_SLIDER_BUTTON = "//*[contains(@content-desc, '������� �����')]";
    private final static String OPEN_CALENDAR_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/action_filter";
    private final static String OPEN_FIND_STRING_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/action_search";
    private final static String CREATE_FISCAL_DOCUMENTS_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/addRecipeButton";
    private final static String OPEN_KKT_SETTINGS_BUTTON = "//*[./*[contains(@text, '�����')]]";
    private final static String OPEN_TERMINAL_SETTINGS_BUTTON = "//*[./*[contains(@text, '�������� ������')]]";
    private final static String OPEN_MENU_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/settingsButton";
    private final static String FIND_BY_BARCODE_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/scanButton";
    private final static String LOGOUT_BUTTON = "//*contains[@text, '�����']";
    private final static String OK_BUTTON = "android:id/button1";
    private final static String CANCEL_BUTTON = "android:id/button2";

    /*----------------------------FISCAL_DOCUMENTS---------------------------------------------------------*/
    private final static String SALE_ORDER = "//*[contains(@text, '�������')]";
    private final static String RETURN_SALE = "//*[contains(@text, '������� �������')]";
    private final static String PARRISH_CORRECTION = "//*[contains(@text, '��������� �������')]";
    private final static String FLOW_CORRECTION = "//*[contains(@text, '��������� �������')]";

    /*--------------------------------METHODS-------------------------------------------------------------*/

    @Step("���� �������� ������� �������� ���")
    public MainPage waitForMainPageLoad(){
        $(By.xpath(OMK_LABEL));
        return page(MainPage.class);
    }

    @Step("��������� ������� �������")
    public MainPage openSlider(){
        $(By.xpath(OPEN_SLIDER_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("��������� ������ ������")
    public MainPage finFiscalDoc(){
        $(By.id(OPEN_FIND_STRING_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("��������� ���������")
    public MainPage openCalendar(){
        $(By.id(OPEN_CALENDAR_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("������� ���������� ��������")
    public MainPage createFiscalDoc(@Nonnull String fiscalDoc){
        $(By.id(CREATE_FISCAL_DOCUMENTS_BUTTON)).click();
        switch (fiscalDoc.toLowerCase()){
            case "�������":
                $(By.xpath(SALE_ORDER)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "�������":
                $(By.xpath(RETURN_SALE)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "��������� �������":
                $(By.xpath(PARRISH_CORRECTION)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            case "��������� �������":
                $(By.xpath(FLOW_CORRECTION)).click();
                $(By.id(OK_BUTTON)).click();
                break;
            default:
                System.out.println("������ ���� ���������� ��� ���� �� ������� ��������, " +
                                    "������� �� �������� ����������� ���������");
                $(By.id(CANCEL_BUTTON)).click();
                break;
        }
        return page(MainPage.class);
    }

    /*-------------------------SLIDER-METHODS-------------------------------------------------------------*/

    @Step("�������� � ��������� ���������")
    public MainPage goToTerminalSettings(){
        $(By.xpath(OPEN_TERMINAL_SETTINGS_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("��������� � ��������� ���")
    public MainPage goToKktSettings(){
        $(By.xpath(OPEN_KKT_SETTINGS_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("��������� � ���������")
    public MainPage goToSettings(){
        $(By.id(OPEN_MENU_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("������� �� �������� ����������")
    public MainPage logout(){
        $(By.xpath(LOGOUT_BUTTON)).click();
        return page(MainPage.class);
    }

    @Step("��������� � ����� ���� �� ����� ����")
    public MainPage findByScan(){
        $(By.id(FIND_BY_BARCODE_BUTTON)).click();
        return page(MainPage.class);
    }


}
