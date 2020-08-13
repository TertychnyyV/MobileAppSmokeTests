package omcdPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CreateReceiptPage {

    /*--------------------------------ELEMENTS-------------------------------------------------------------*/
    private static final String DATE_OF_CREATE = "ru.cdc.optimum.mobilecashdesk:id/dateTextView";
    private static final String TITLE_OF_RECEIPT = "ru.cdc.optimum.mobilecashdesk:id/titleTextView";
    private static final String TOTAL_SUM = "ru.cdc.optimum.mobilecashdesk:id/receiptTotalTextView";
    private static final String SEARCH_FIELD = "ru.cdc.optimum.mobilecashdesk:id/searchEditText";

    /*--------------------------------BUTTONS-------------------------------------------------------------*/
    private static final String SEARCH_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/search_button";
    //private static final String GO_TO_MAIN_PAIGE =
    private static final String PRINT_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/action_print";
    private static final String ADD_PRODUCT_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/addProductButton";
    private static final String FIND_BY_BARCODE_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/addProductScannerButton";
    private static final String AUTO_PICK_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/autopickingButton";
    private static final String CLEAR_SEARH_FIELD_BUTTON = "ru.cdc.optimum.mobilecashdesk:id/search_delete_button";

    /*--------------------------------METHODS-------------------------------------------------------------*/

    @Step("Переходим в выбор продуктов для добавления")
    public CreateReceiptPage addProduct(){
        $(By.id(ADD_PRODUCT_BUTTON)).click();
        return page(CreateReceiptPage.class);
    }

    @Step("Переходим в печать чека на ККТ")
    public CreateReceiptPage printReceipt(){
        $(By.id(PRINT_BUTTON)).click();
        return page(CreateReceiptPage.class);
    }
}
