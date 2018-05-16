package pom.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.qa.util.RS_Test_Util;

public class Test_Base {

	public static WebDriver driver;
	public static Properties prop;

	public Test_Base(){
		 try{
			 prop = new Properties();
	FileInputStream ip = new FileInputStream("/Users/sonalikarde/eclipse-workspace/RS_Automation/src/main/java/pom/qa/config/config.properties");
		prop.load(ip);
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "/Users/sonalikarde/Documents/SeleniumSupporters/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(RS_Test_Util.page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(RS_Test_Util.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
