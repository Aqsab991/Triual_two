package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Crop_view;
import pageobjects.EditImageScreen;

public class crop_two extends baseclasstwo{
	@BeforeClass
	 public void auto_set_up()
	 {
	 eyes.open(driver, APP_NAME, TEST_NAME);
	 System.out.println("Eyes open");
	 }
	 @Test
	  public void A_Testcase1() throws InterruptedException {
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		
	
		
			MobileElement Searchbar=element1.search_bar;
		 
			 wait(Searchbar);
			 MobileElement forward_icon=element1.forward_icon;
			 forward_icon.click();
		 
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement crop_view=element2.crop_view;
		 Thread.sleep(10000);
	//	 wait(crop_view);
		 footer_options.get(0).click();
		 
		 MobileElement close_crop_view=element2.close_crop_view;
		 
		 if(close_crop_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened crop view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		 
		 
	 }
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
				 MobileElement close_crop_view=element2.close_crop_view;
		

		 
		 MobileElement save_img_view=element2.save_img_view;
		 close_crop_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,rop view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close crop");
		 	}
		 
		 
		 
	 }
	
	 @Test
	  public void C_Testcase3() throws MalformedURLException, InterruptedException, URISyntaxException {
		
		 
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		
		 MobileElement rotate_view=element2.rotateview;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement rotate_view_text=element2.scroll_textview;
		// Thread.sleep(10000);
	//	 wait(crop_view);
		 footer_options.get(0).click();
		 rotate_view.click();
		 System.out.println("Text on scroll view"+rotate_view_text.getText());
		 String rotateViewText=rotate_view_text.getText();
		 //Open Eyes and start visual testing
	       
	        eyes.checkWindow("Start Screen");
	    
	/*	 if(eyes.close() != null) {
			// End visual testing. Validate visual correctness.
		        
			 System.out.println("TC:3 Image is sucessfully rotated to 90 degrees !!!");
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Failed to rotate an image");
			}
			*/	 
	 }
	 @Test
	  public void D_Testcase4() throws MalformedURLException, InterruptedException, URISyntaxException{
		
		 
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		
		 MobileElement reset_view=element2.reset_icon;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement rotate_view_text=element2.scroll_textview;
		// Thread.sleep(10000);
	//	 wait(crop_view);
	//	 footer_options.get(0).click();
		 reset_view.click();
		 System.out.println("Degree on scroll view"+rotate_view_text.getText());
		 String rotateViewText=rotate_view_text.getText();
		
	        eyes.checkWindow("Reverted rotate Screen");
	       
				 
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException {
		
		 
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		
		 MobileElement reset_view=element2.reset_icon;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement rotate_view_text=element2.scroll_textview;
		// Thread.sleep(10000);
	//	 wait(crop_view);
	//	 footer_options.get(0).click();
		 //Locating seekbar using resource id
        MobileElement seek_bar=element2.scrollwheel;
        // get start co-ordinate of seekbar
        int start=seek_bar.getLocation().getX();
        //Get width of seekbar
        int end=seek_bar.getSize().getWidth();
        //get location of seekbar vertically
        int y=seek_bar.getLocation().getY();

    // Select till which position you want to move the seekbar
    TouchAction action=new TouchAction(driver);

    //Move it will the end
//    action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//    .moveTo(PointOption.point(end, y)).release().perform();
//    action.press(start,y).moveTo(end,y).release().perform();

    //Move it 40%
    int moveTo=(int)(end*-0.6);
    action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
		 System.out.println("Degrees on rotate view"+rotate_view_text.getText());
		 String rotateViewText=rotate_view_text.getText();
		 
		 eyes.checkWindow("Clockwise rotated Screen");
	/*	 if(rotateViewText.contains("20")) {
			 
			 System.out.println("TC:5 Image is sucessfully reverted to clockwise!!!");
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Failed to revert an image");
			}*/
				 
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException {
		
		 
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		
		 MobileElement reset_view=element2.reset_icon;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement rotate_view_text=element2.scroll_textview;
		// Thread.sleep(10000);
	//	 wait(crop_view);
	//	 footer_options.get(0).click();
		 //Locating seekbar using resource id
		 reset_view.click();
       MobileElement seek_bar=element2.scrollwheel;
       // get start co-ordinate of seekbar
       int start=seek_bar.getLocation().getX();
       //Get width of seekbar
       int end=seek_bar.getSize().getWidth();
       //get location of seekbar vertically
       int y=seek_bar.getLocation().getY();

   // Select till which position you want to move the seekbar
   TouchAction action=new TouchAction(driver);

   //Move it will the end
//   action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//   .moveTo(PointOption.point(end, y)).release().perform();
//   action.press(start,y).moveTo(end,y).release().perform();

   //Move it 40%
   int moveTo=(int)(end*0.9);
   action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
		 System.out.println("Degrees on rotate view"+rotate_view_text.getText());
		 String rotateViewText=rotate_view_text.getText();
		 
	/*	 if(rotateViewText.contains("-19")) {
			 
			 System.out.println("TC:6 Image is sucessfully reverted to anti-clockwise!!!");
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Failed to revert an image");
			}*/
		 eyes.checkWindow("Anti-Clockwise rotated Screen");
		 reset_view.click(); 
	 }
	 @Test
	  public void G_Testcase7() throws InterruptedException {
		 Crop_view element2= new Crop_view((AndroidDriver) driver);
		 List<MobileElement> crop_options=element2.cropoptions;
		 
		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_crop=element2.apply_crop;
		 MobileElement close_editor=element2.back_view;
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
		 List<MobileElement> footer_options=element2.footer_options;
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
		 MobileElement crop_recycler_view=element2.crop_recyclerview;
		
		 footer_options.get(0).click();
		
		 for(int i=0;i<4;i++) {
			 crop_options.get(i).click();
			 Actions crop = new Actions(driver);
			 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
			 Thread.sleep(10000);
			 apply_crop.click();
			 
			 wait(save_img_view);
		/*	 if(save_img_view.isDisplayed()==true) {
			 	 
			 	 System.out.println("TC:7 Crop"+i+"working fine !!!");
			 	footer_options.get(0).click();
			 	}
			 	else {
			 		Assert.assertTrue(false);
			 		System.out.println("Crop not working....");
			 	}*/
			 eyes.checkWindow("Crop "+i+" Screen");
			 footer_options.get(0).click();
	//		 if(i!=0 && i % 4 == 0) {
				 System.out.println("i="+i); 
		/*		 org.openqa.selenium.Dimension size=driver.manage().window().getSize();			       // get start co-ordinate of seekbar
		         //   int start=crop_recycler_view.getLocation().getX();
				 int startx=(int) (size.width * 0.9);
				 int endx=(int) (size.width * 0.01);
		            //Get width of seekbar
				  int anchor=(int) (size.getHeight()*0.9);
		         //   int end=crop_recycler_view.getSize().getWidth();
		            //get location of seekbar vertically
		        //    int endy=(int) (size.getHeight()*0.9);
		            TouchAction action=new TouchAction(driver);

			        //Move it will the end
			//        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
			//        .moveTo(PointOption.point(end, y)).release().perform();
			  //      action.press(start,y).moveTo(end,y).release().perform();

			        //Move it 40%
			      //  int moveTo=(int)(end*0.7);
		          //  long l=2000;
			        action.press(PointOption.point(startx,anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(endx, anchor)).release().perform();
			       
				 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
			                + "resourceId(\"<id of scrollable control>\"))"
			                + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"<text to search for>\"))"); 
			     */
			
		/*	 }
		 
			 else {
				 System.out.println("not a multiple of four"); 
			 }
	*/
			 		 
		 }
	
		 for(int i=0;i<4;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/featureThumb\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("1st scroll done"); 
			 
			 crop_options.get(i).click();
			 Actions crop = new Actions(driver);
			 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
			 Thread.sleep(10000);
			 apply_crop.click();
			 
			 wait(save_img_view);
			/* if(save_img_view.isDisplayed()==true) {
			 	 
			 	 System.out.println("TC:7 Crop"+i+"working fine !!!");
			 	footer_options.get(0).click();
			 	}
			 	else {
			 		Assert.assertTrue(false);
			 		System.out.println("Crop not working....");
			 	}*/
	//		 if(i!=0 && i % 4 == 0) {
			 eyes.checkWindow("Crop "+i+"in 2nd set Screen");
			 footer_options.get(0).click();
				 System.out.println("i="+i); 
				 
		 } 
		 MobileElement crop_view=element2.close_crop_view;
		 crop_view.click();
		 close_editor.click();
		 forward_icon.click();
		 Thread.sleep(5000);
		 footer_options.get(0).click();
		 for(int i=0;i<4;i++) {
			
			 for(int j=0;j<2;j++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/featureThumb\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("2nd time scroll done"); 
			 }
			 crop_options.get(i).click();
			 Actions crop = new Actions(driver);
			 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
			 Thread.sleep(10000);
			 apply_crop.click();
			 
			 wait(save_img_view);
		/*	 if(save_img_view.isDisplayed()==true) {
			 	 
			 	 System.out.println("TC:7 Crop"+i+"working fine !!!");
			 	footer_options.get(0).click();
			 	}
			 	else {
			 		Assert.assertTrue(false);
			 		System.out.println("Crop not working....");
			 	}*/
			 eyes.checkWindow("Crop "+i+"in 3rd set Screen");
			 footer_options.get(0).click();
	//		 if(i!=0 && i % 4 == 0) {
				 System.out.println("i="+i); 

			 		 
		 }
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<3;j++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/featureThumb\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("3rd scroll done"); 
			 }
			 crop_options.get(3+i).click();
			 Actions crop = new Actions(driver);
			 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
			 Thread.sleep(10000);
			 apply_crop.click();
			 
			 wait(save_img_view);
		/*	 if(save_img_view.isDisplayed()==true) {
			 	 
			 	 System.out.println("TC:7 Crop"+i+"working fine !!!");
			 	footer_options.get(0).click();
			 	}
			 	else {
			 		Assert.assertTrue(false);
			 		System.out.println("Crop not working....");
			 	}*/
			 eyes.checkWindow("Crop "+i+"in 4th set Screen");
			 footer_options.get(0).click();
	//		 if(i!=0 && i % 4 == 0) {
				 System.out.println("i="+i); 

			 		 
		 } 
 MobileElement close_crop_view=element2.close_crop_view;
		

		 
	//	 MobileElement save_img_view=element2.save_img_view;
		 close_crop_view.click();
	 }
	  @AfterClass
	    public void teardown() {
		  eyes.close();
	        System.out.println("closed window");
	        //close the app
	        driver.quit();
	        //Abort eyes if it is not closed
	        eyes.abortIfNotClosed();
	    }
}
