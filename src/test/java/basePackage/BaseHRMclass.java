package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.Timeutis;

public class BaseHRMclass {
	
public static Properties prop= new Properties();
public static WebDriver driver;
Duration duration = Duration.ofSeconds(100);

public BaseHRMclass() {
	
	try {
		FileInputStream file = new FileInputStream("C:\\Users\\Abhi\\eclipse-workspace\\HRmanagement\\src\\test\\java\\environmentvariables\\config.properties");
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public static void initiation() {
	String browsername=prop.getProperty("browser");
	
	if (browsername.equals("Firefox")){
		System.getProperty("webdriver.gecko.driver","geckodriver.exe");
		    driver= new FirefoxDriver();
		} else if (browsername.equals("chrome"));{
	    System.getProperty("webdriver.chrome.driver","chromedriver.exe");
	        driver= new ChromeDriver();
	        }
	
	
 driver.manage().window().maximize();
 driver.manage().timeouts().pageLoadTimeout(Timeutis.duration);
}
}