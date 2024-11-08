package Generic_Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Downloads\\Commondata - SwagLabs.txt");
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }
}
