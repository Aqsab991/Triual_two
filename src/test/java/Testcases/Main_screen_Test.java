package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;

import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Gallery;
import pageobjects.Googlebg;

public class Main_screen_Test extends baseclasstwo {

	/* @Test
	    public void testSeekBar()throws  Exception
	    {
		 Thread.sleep(60000);
		 EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
	           //Locating seekbar using resource id
	            MobileElement seek_bar=element1.seek_bar;
	            // get start co-ordinate of seekbar
	            int start=seek_bar.getLocation().getX();
	            //Get width of seekbar
	            int end=seek_bar.getSize().getWidth();
	            //get location of seekbar vertically
	            int y=seek_bar.getLocation().getY();

	        // Select till which position you want to move the seekbar
	        TouchAction action=new TouchAction(driver);

	        //Move it will the end
	        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();

	        //Move it 40%
	        int moveTo=(int)(end*0.4);
	        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();

	    }*/
	 @Test
	  public void A_Testcase1() {
		  
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  Gallery element2=new Gallery((AndroidDriver)driver);
		
	
		  MobileElement galley_tab=element2.architecture_tab; 
			MobileElement Searchbar=element1.search_bar;
		 
			 wait(Searchbar);
			 px_layout.get(2).click();
			 if(galley_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:1 Gallery is displayed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open Galley bg");
				}
	  }
	 @Test
	  public void B_Testcase2() {
		  
		 
		  Gallery element2=new  Gallery((AndroidDriver)driver);
		 List<MobileElement> gallery_image=(List<MobileElement>) element2.gallery_image;
	
		  
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		MobileElement Searchbar=element1.search_bar;
		MobileElement pics=element2.pic_tab;
		//	 wait(Searchbar);
		pics.click();
		  gallery_image.get(10).click();
			 if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("TC:2 Image is applied!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to load image");
				}
	  }
	 @Test
	  public void C_Testcase3() {
		  
		 
		  Gallery element2=new  Gallery((AndroidDriver)driver);
		  MobileElement albums_tab=element2.albums_tab;
		  MobileElement download_folder=element2.download_folder;
		 List<MobileElement> gallery_image=(List<MobileElement>) element2.gallery_image;
	
		  
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		MobileElement Searchbar=element1.search_bar;
		px_layout.get(2).click();
		//	 wait(Searchbar);
		albums_tab.click();
		download_folder.click();
	/*	  gallery_image.get(9).click();
		
			 px_layout.get(2).click();
	//		 ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Background_Images\"));").click();
		//	 Dimension size = driver.manage().window().getSize();

		        TouchAction t = new TouchAction(driver);
		        t.press(PointOption.point(477, 1600))
		                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		                .moveTo(PointOption.point(494, 386))
		                .release()
		                .perform();*/
		 gallery_image.get(9).click();
			 if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("TC:3 Image is applied!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to load image");
				}
	 }
}
