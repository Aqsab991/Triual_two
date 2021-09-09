package Baseclass;


import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseclasstwo {
	  public final   String        APP_NAME  = "object1";
	   public final   String        TEST_NAME = "object1";
	    public final   String        DEVICE    = "Galaxy A31";
	
	    public Eyes          eyes;
	    public  static AppiumDriver  driver;
	protected Properties property;
	InputStream inputstream;
  @BeforeTest
  public void beforeTest() {
	  try {
		  property=new Properties();
		  String propertiesFilename="config.properties";
		  //input stream object to get properties file
		  inputstream= getClass().getClassLoader().getResourceAsStream(propertiesFilename);
		  property.load(inputstream);
	  DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Galaxy A31");
	//	cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("udid", "RF8R1178CVN");
		cap.setCapability("automationName", property.getProperty("androidAutomationName"));
		cap.setCapability("autoGrantPermissions", true); 
		//cap.setCapability("autoAcceptAlerts", "true");
		cap.setCapability("noReset", true);
		cap.setCapability("newCommandTimeout", 360);
		   cap.setCapability("skipUnlock", "true");
		//   cap.setCapability("systemPort", 8210);
		
	//	String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "test"+ File.separator+ "resources"+ File.separator+ "app-debug.apk";
	//	System.out.println("path  "+path);
	//	/Users/aqsa/eclipse-workspace/BGChangerFW/src/test/resources/app/app-debug.apk 
	//	cap.setCapability("app", "path");
	//	URL apppath=getClass().getClassLoader().getResource(property.getProperty("androidAppLocation"));
	//	cap.setCapability("app", "apppath");
		String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "main"+ File.separator+ "resources"+ File.separator+ "BG-v3.1.0.apk";
		cap.setCapability("app", path);
		cap.setCapability("appPackage", property.getProperty("androidAppPackage"));
		cap.setCapability("appActivity", property.getProperty("androidAppActivity"));
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver<AndroidElement>(url,cap);
		 //Setup of Applitools Eyes
       

	  }
	  catch(Exception e) {
		  e.printStackTrace();	  }
  }
  public void wait(MobileElement e) {
	  
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(e));
}
  public void wait2(MobileElement e) {
	  
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(e));
}
  @AfterTest
  public void afterTest() {
	//  driver.close();
	  driver.quit();
  }
}
