package omcdPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class PinCodePage {

    /*--------------------------------ELEMENT-------------------------------------------------------------*/
    private static final String PIN_CODE_BLOCK = "ru.cdc.optimum.mobilecashdesk:id/pass_code_view";

    /*--------------------------------VALUES-------------------------------------------------------------*/
    private static final int PIN_SIZE = 4;
    private static final int LOADING_TIMEOUT = 60000;

    /*--------------------------------METHODS-------------------------------------------------------------*/

    //
    @Step("Вводим пинкод")
    public PinCodePage enterPin() {
        waitToLoad();
        for(int count=0; count<PIN_SIZE; count++){
            pushToElementButton();
        }
        return page(PinCodePage.class);
    }

    /*--------------------------------PROTECTED_METHODS--------------------------------------------------*/
    protected PinCodePage waitToLoad(){
        $(By.id(PIN_CODE_BLOCK)).waitUntil(Condition.visible, LOADING_TIMEOUT);
        return page(PinCodePage.class);
    }

    protected PinCodePage pushToElementButton() {
        WebDriver driver = getWebDriver();
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        SelenideElement element = $(By.id(PIN_CODE_BLOCK));
        int left_x = element.getLocation().getX();
        int right_x = left_x + element.getSize().getWidth();
        int upper_y = element.getLocation().getY();
        int lower_y = upper_y + element.getSize().getHeight();
        int middle_x = (right_x + left_x) / 2;
        int middle_y = (upper_y + lower_y) / 2;
        PointOption point = PointOption.point(middle_x, middle_y);
        action.press(point).release().perform();
        return page(PinCodePage.class);
    }
}
