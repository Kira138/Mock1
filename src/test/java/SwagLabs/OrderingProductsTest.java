package SwagLabs;

import Generic_Utilities.BaseClass;
import Generic_Utilities.ExcelUtility;
import objectRepository.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingProductsTest extends BaseClass {
    @Test
    public void orderProduct() throws Throwable {
        // Initialize utilities
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        InformationPage infoPage = new InformationPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        CompletePage completePage = new CompletePage(driver);
        ExcelUtility excelUtility = new ExcelUtility();

        // Login
        String username = fileUtility.readProperty("username");
        String password = fileUtility.readProperty("password");
        loginPage.login(username, password);

        // Add products to cart and proceed to checkout
        productPage.addProductsToCart();
        productPage.goToCart();
        cartPage.proceedToCheckout();

        // Fetch user information from Excel
        String firstName = excelUtility.getExcelData("SwagLabs", 1, 0);
        String lastName = excelUtility.getExcelData("SwagLabs", 1, 1);
        String postalCode = excelUtility.getExcelDataUsingFormatter("SwagLabs", 1, 2);

        // Enter user information and complete purchase
        infoPage.enterInformation(firstName, lastName, postalCode);
        paymentPage.completePurchase();

        // Verify order completion
        String actualMessage = completePage.getConfirmationMessage();
        String expectedMessage = "THANK YOU FOR YOUR ORDER!";
        Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage), "Order confirmation message does not match.");
    }
}
