package SwagLabs;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import objectRepository.PaymentPage;

public class Payment_Page extends BaseClass {

	@Test(dependsOnMethods= {"InfPage"})
	 public void Payment() {
		 
		 PaymentPage paymentPage = new PaymentPage(driver);
		 paymentPage.completePurchase();
		 
	 }
}
