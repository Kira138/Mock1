package SwagLabs;

import Generic_Utilities.BaseClass;

import objectRepository.*;
import org.testng.annotations.Test;

public class AddToCart_Page extends BaseClass {

	@Test(dependsOnMethods= {"LoginPage"})
	public void AddToCart() throws Throwable {
        // Initialize utilities
        AddToCartPage AddCart = new AddToCartPage(driver);
      
        
        // Add products to cart and proceed to checkout
        AddCart.addProductsToCart();
        AddCart.goToCart();
     
}
}
