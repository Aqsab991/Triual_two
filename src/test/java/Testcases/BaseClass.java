package Testcases;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.Home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;



import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
 
   
	protected AppiumDriver  driver;
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
		cap.setCapability("deviceName", "Galaxy Note8");
	//	cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("udid", "ce0717177b2ad026017e");
		cap.setCapability("automationName", property.getProperty("androidAutomationName"));
		cap.setCapability("autoGrantPermissions", true); 
		//cap.setCapability("autoAcceptAlerts", "true");
		cap.setCapability("noReset", true);
		cap.setCapability("newCommandTimeout", 240);
		
		
	//	String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "test"+ File.separator+ "resources"+ File.separator+ "app-debug.apk";
	//	System.out.println("path  "+path);
	//	/Users/aqsa/eclipse-workspace/BGChangerFW/src/test/resources/app/app-debug.apk 
	//	cap.setCapability("app", "path");
	//	URL apppath=getClass().getClassLoader().getResource(property.getProperty("androidAppLocation"));
	//	cap.setCapability("app", "apppath");
		String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "main"+ File.separator+ "resources"+ File.separator+ "bg-v3.0.1.apk";
		cap.setCapability("app", path);
		cap.setCapability("appPackage", property.getProperty("androidAppPackage"));
		cap.setCapability("appActivity", property.getProperty("androidAppActivity"));
		URL url=new URL(property.getProperty("appiumUrl"));
		driver= new AndroidDriver<AndroidElement>(url,cap);
	
	  //  return driver;
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
