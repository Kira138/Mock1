package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton1;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartButton2;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addToCartButton3;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartLink;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addProductsToCart() {
        addToCartButton1.click();
        addToCartButton2.click();
        addToCartButton3.click();
    }

    public void goToCart() {
        cartLink.click();
    }
}

