package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	  public WebDriver driver;
	    public FileUtility fileUtility = new FileUtility();
	    public WebDriverUtility webDriverUtility = new WebDriverUtility();

	    @BeforeSuite
	    public void setup() throws Exception {
	        String browser = fileUtility.readProperty("browser");
	        driver = webDriverUtility.initializeDriver(browser);
	        driver.get(fileUtility.readProperty("url"));
	    }

	    @AfterSuite
	    public void tearDown() {
	        driver.quit();
	    }
}
