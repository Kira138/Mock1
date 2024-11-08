package SwagLabs;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import objectRepository.CartPage;

public class Cart_Page extends BaseClass {

	@Test(dependsOnMethods= {"AddToCart"})
	public void cart() throws Throwable {
        // Initialize utilities
        CartPage cartPage = new CartPage(driver);
        
        // Add products to cart and proceed to checkout
        cartPage.proceedToCheckout();
}
}
