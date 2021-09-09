package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import Baseclass.baseclasstwo;

import java.time.Duration;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Magazine_pageobject;

public class neon_bg extends baseclasstwo {

	@BeforeClass
	 public void auto_set_up() throws InterruptedException
	 {
		 eyes = new Eyes();
	   	 //Set API Key of Eyes
	        eyes.setApiKey("iwN8b8CiT03Out4MGB9PrS8P5cjNbU3r4RWN2sN7BbM110");
	        //Set Match Level
	        eyes.setMatchLevel(MatchLevel.STRICT);
	        //Set host operating System as our device
	        eyes.setHostOS(DEVICE);
		  //  return driver;
	 eyes.open(driver, APP_NAME, TEST_NAME);
	 System.out.println("Eyes open");
	
	 
	 }
	 @Test
	  public void A_Testcase1() throws InterruptedException {
		
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 List<MobileElement> categories=element2.categories;
		 categories.get(3).click();
for(int j=0;j<4;j++) {
	bg_options.get(j).click();
	 if(j==0) {
		 Thread.sleep(10000);}
		 else {
			 System.out.println("Don't wait");
		 }
			 
			
			 eyes.checkWindow("Bg "+j+" in Neon cat");
}
		 for(int i=0;i<1;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
		
				 for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			
			 eyes.checkWindow("Bg "+j+" in 2nd set of neon cat");
				 }
			 
			 
				 System.out.println("i="+i); 
	 }
	 

}
	 @AfterClass
	    public void teardown() {
		  eyes.close();
	        System.out.println("closed window");
	        //Abort eyes if it is not closed
	        eyes.abortIfNotClosed();
	    }
}
