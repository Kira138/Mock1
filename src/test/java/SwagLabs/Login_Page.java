package SwagLabs;

import java.io.IOException;
import org.testng.annotations.Test;
import Generic_Utilities.BaseClass;
import objectRepository.LoginPage;


public class Login_Page extends BaseClass {
@Test
	 public void LoginPage() throws IOException {
	        // Initialize utilities
	        LoginPage loginPage = new LoginPage(driver);
	      

	        // Login
	        String username = fileUtility.readProperty("username");
	        String password = fileUtility.readProperty("password");
	        loginPage.login(username, password);
}
}
