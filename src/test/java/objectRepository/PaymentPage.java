package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
    @FindBy(id = "finish")
    private WebElement finishButton;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completePurchase() {
        finishButton.click();
    }
}
