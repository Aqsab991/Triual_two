package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Overlay_view_Test;
import pageobjects.adjustment_view_pg;

public class Adjustments_test extends baseclasstwo {

	 @Test
	  public void A_Testcase1() throws InterruptedException {
		 Thread.sleep(10000);
		adjustment_view_pg element2= new  adjustment_view_pg((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement undo=element2.undo;
		
	//	 wait(footer_options.get(2));
		 footer_options.get(3).click();
		 
		 MobileElement  close_overlay_view=element2.close_overlay_view;
		 
		 if( close_overlay_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Adjustments view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		 
	 }
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 adjustment_view_pg  element2= new   adjustment_view_pg ((AndroidDriver) driver);
				 MobileElement  close_overlay_view=element2.close_overlay_view;
		

		 
		 MobileElement save_img_view=element2.save_img_view;
		 close_overlay_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,filter view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close crop");
		 	}
		 
		 
		 
	 }
	 @Test
	  public void C_Testcase3() throws MalformedURLException, InterruptedException, URISyntaxException {
		
		 
		 adjustment_view_pg  element2= new  adjustment_view_pg ((AndroidDriver) driver);
		
		 MobileElement undo=element2.undo;
		 MobileElement intensity_slider=(MobileElement) element2.intensity_slider;
		 List<MobileElement> footer_options=element2.footer_options;
		 
		 footer_options.get(3).click();
	//	 rotate_view.click();
		 System.out.println("Clicked on adjustments");
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> adjustments_options=element2.adjustments_options;
		 
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		
		 for(int i=0;i<5;i++) {
			 adjustments_options.get(i).click();
			
			//Locating seekbar using resource id
	      //      MobileElement seek_bar=element1.seek_bar;
	            // get start co-ordinate of seekbar
	            int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.6);
	        System.out.println("move to:"+moveTo);
	        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();

		
			 apply_overlay.click();
			 
			 wait(save_img_view);
	
		//	 eyes.checkWindow("Filter "+i+" Screen");
           undo(i,undo);
           footer_options.get(3).click();

				 System.out.println("i="+i); 	 
		 }  
		 for(int j=0;j<3;j++) {
		
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/titleName\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(3);	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 System.out.println(" scroll done"); 
		 
			 adjustments_options.get(j+3).click();
	          int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.6);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();

		
			 apply_overlay.click();
			 
			 wait(save_img_view);
	
		//	 eyes.checkWindow("Filter "+i+" Screen");
         undo(j+6,undo);
         footer_options.get(3).click();

				 System.out.println("j="+j); 	 
		 
		 
		 }
	 }
	 @Test
	  public void D_Testcase4() throws MalformedURLException, InterruptedException, URISyntaxException {
		
		 
		 adjustment_view_pg  element2= new  adjustment_view_pg ((AndroidDriver) driver);
		
		 MobileElement undo=element2.undo;
		 MobileElement intensity_slider=(MobileElement) element2.intensity_slider;
		 List<MobileElement> footer_options=element2.footer_options;
		 
		 footer_options.get(3).click();
	//	 rotate_view.click();
		 System.out.println("Clicked on adjustments");
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> adjustments_options=element2.adjustments_options;
		 
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		
		 for(int i=0;i<5;i++) {
			 adjustments_options.get(i).click();
			
			//Locating seekbar using resource id
	      //      MobileElement seek_bar=element1.seek_bar;
	            // get start co-ordinate of seekbar
	            int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*1.6);
	        System.out.println("move to:"+moveTo);
	        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();

		
			 apply_overlay.click();
			 
			 wait(save_img_view);
	
		//	 eyes.checkWindow("Filter "+i+" Screen");
          undo(i,undo);
          footer_options.get(3).click();

				 System.out.println("i="+i); 	 
		 }  
		 for(int j=0;j<3;j++) {
		
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/titleName\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(3);	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 System.out.println(" scroll done"); 
		 
			 adjustments_options.get(j+3).click();
	          int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*1.6);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();

		
			 apply_overlay.click();
			 
			 wait(save_img_view);
	
		//	 eyes.checkWindow("Filter "+i+" Screen");
        undo(j+6,undo);
        footer_options.get(3).click();

				 System.out.println("j="+j); 	 
		 
		 
		 }
	 }
	 public void undo(int i,MobileElement undo) {
		 for(int j=0;j<=i;j++) {
			 undo.click();
			 System.out.println("undodone"+i+"times"); 
		 }
		
	 }
	
}
