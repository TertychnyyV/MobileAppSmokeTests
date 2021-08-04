//package omcdPages;
//
//import io.qameta.allure.Step;
//import org.openqa.selenium.By;
//
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.page;
//
//public class BasePage {
//
//    /*--------------------------------BUTTONS-------------------------------------------------------------*/
//    private static final String OPEN_SLIDER_BUTTON = "//*[contains(@content-desc, 'Перейти вверх')]";
//
//
//    /*--------------------------------METHODS-------------------------------------------------------------*/
//
//    @Step("Открыть левый слайдер")
//    public BasePage openSlider(){
//        $(By.xpath(OPEN_SLIDER_BUTTON)).click();
//        return page(BasePage.class);
//    }
//
//
//}
