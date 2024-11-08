package SwagLabs;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.ExcelUtility;
import objectRepository.InformationPage;


public class Information_Page extends BaseClass {

	@Test(dependsOnMethods= {"cart"})
	 public void InfPage() throws Throwable {
	        // Initialize utilities
	        InformationPage infoPage = new InformationPage(driver);
	        ExcelUtility excelUtility = new ExcelUtility();
    // Fetch user information from Excel
    String firstName = excelUtility.getExcelData("SwagLabs", 1, 0);
    String lastName = excelUtility.getExcelData("SwagLabs", 1, 1);
    String postalCode = excelUtility.getExcelDataUsingFormatter("SwagLabs", 1, 2);
    
    // Enter user information and complete purchase
    infoPage.enterInformation(firstName, lastName, postalCode);
}
}
