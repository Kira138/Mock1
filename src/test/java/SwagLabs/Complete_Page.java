package SwagLabs;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import objectRepository.CompletePage;

public class Complete_Page extends BaseClass {

	@Test(dependsOnMethods= {"Payment"})
	public void Complete() throws Throwable {

        CompletePage completePage = new CompletePage(driver);
    
	// Verify order completion
    String actualMessage = completePage.getConfirmationMessage();
    String expectedMessage = "THANK YOU FOR YOUR ORDER!";
    Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage), "Order confirmation message does not match.");
}
}
