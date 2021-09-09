package Testcases;


	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
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
import pageobjects.Filter_view;

	public class Filters_module extends baseclasstwo{
	/*	@BeforeClass
		 public void auto_set_up()
		 {
		 eyes.open(driver, APP_NAME, TEST_NAME);
		 System.out.println("Eyes open");
		 }*/
		 @Test
		  public void A_Testcase1() throws InterruptedException {
			
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
			 List<MobileElement> footer_options=element2.footer_options;
			 MobileElement undo=element2.undo;
			 Thread.sleep(10000);
		//	 wait(crop_view);
			 footer_options.get(1).click();
			 
			 MobileElement close_filter_view=element2.close_filter_view;
			 
			 if(close_filter_view.isDisplayed()) {
				 
				 System.out.println("TC:1 Woohoo Successfully opened Filter view :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
			 
			 
			 
		 }
		 @Test
		  public void B_Testcase2() throws InterruptedException {
			
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
					 MobileElement close_filter_view=element2.close_filter_view;
			

			 
			 MobileElement save_img_view=element2.save_img_view;
			 close_filter_view.click();
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
			
			 
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
			
			 MobileElement undo=element2.undo;
			 List<MobileElement> footer_options=element2.footer_options;
			 
			 footer_options.get(1).click();
		//	 rotate_view.click();
			 System.out.println("Clicked on filters");
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 
			
			 for(int i=0;i<5;i++) {
				 filter_options.get(i).click();
				
			//	 Thread.sleep(5000);
				 apply_filter.click();
				 
				 wait(save_img_view);
		
				// eyes.checkWindow("Filter "+i+" Screen");
                 undo(i,undo);
				 footer_options.get(1).click();

					 System.out.println("i="+i); 	 
			 }  
	
		 }
/*		 @Test
		  public void D_Testcase4() throws MalformedURLException, InterruptedException, URISyntaxException {
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
			
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 for(int i=0;i<5;i++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
				 AndroidElement firdelement=e.get(0);
				 AndroidElement secondElement=e.get(1);
				 AndroidElement thirdElement=e.get(2);
				 AndroidElement fourthElement=e.get(3);	
				 AndroidElement fifthElement=e.get(4);	
				 AndroidElement sixthElement=e.get(5);	
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("1st scroll done"); 
				 
				 filter_options.get(i).click();
				
				 Thread.sleep(5000);
				 apply_filter.click();
				 wait(save_img_view);

				 eyes.checkWindow(i+" filter after 1st scroll");
				 undo(i+6,undo);
				 footer_options.get(1).click();
					 System.out.println("i="+i); 
					 
			 }
		 }
		 @Test
		  public void E_Testcase5() throws MalformedURLException, InterruptedException, URISyntaxException {
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement save_img_view=element2.save_img_view;
			 System.out.println("reached till initialiation"); 
			 for(int i=0;i<5;i++) {
					
				 for(int j=0;j<2;j++) {
					 System.out.println("start of loop"); 
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
				 AndroidElement firdelement=e.get(0);
				 AndroidElement secondElement=e.get(1);
				 AndroidElement thirdElement=e.get(2);
				 AndroidElement fourthElement=e.get(3);	
				 AndroidElement fifthElement=e.get(4);
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 System.out.println("got scroll element");
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("2nd time scroll done"); 
				 }
				 filter_options.get(i).click();
			//	 Actions crop = new Actions(driver);
			//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
			//	 Thread.sleep(10000);
				 Thread.sleep(5000);
				 apply_filter.click();
				 wait(save_img_view);
			
				 eyes.checkWindow(i+" filter after 2nd scroll");
				 undo(i+11,undo);
				 footer_options.get(1).click();
					 System.out.println("i="+i); 

				 		 
			 } 
		 }
		 @Test
		  public void F_Testcase6() throws MalformedURLException, InterruptedException, URISyntaxException {
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 MobileElement close_filter_view=element2.close_filter_view;
			 close_filter_view.click();
			 close_editor.click();
			 forward_icon.click();
			 Thread.sleep(5000);
			 footer_options.get(1).click();
			 for(int i=0;i<5;i++) {
				 for(int j=0;j<3;j++) {
					 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
					 AndroidElement firdelement=e.get(0);
					 AndroidElement secondElement=e.get(1);
					 AndroidElement thirdElement=e.get(2);
					 AndroidElement fourthElement=e.get(3);	
					 AndroidElement fifthElement=e.get(4);
					 AndroidElement sixthElement=e.get(5);
					 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
					 int fromXLocation=sixthElement.getLocation().x;
					 int toXLocation=firdelement.getLocation().x;
					 
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("3rd scroll done"); 
				 }
				 filter_options.get(i).click();
					//	 Actions crop = new Actions(driver);
					//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
					//	 Thread.sleep(10000);
						 Thread.sleep(5000);
						 apply_filter.click();
						 wait(save_img_view);
					
						 eyes.checkWindow(i+" filter after 3rd scroll");
						 undo(i,undo);
						 footer_options.get(1).click();
							 System.out.println("i="+i); 

				 		 
			 }  
		 }
		 @Test
		  public void G_Testcase7() throws MalformedURLException, InterruptedException, URISyntaxException {
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
	
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 for(int i=0;i<5;i++) {
				 for(int j=0;j<4;j++) {
					 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
					 AndroidElement firdelement=e.get(0);
					 AndroidElement secondElement=e.get(1);
					 AndroidElement thirdElement=e.get(2);
					 AndroidElement fourthElement=e.get(3);	
					 AndroidElement fifthElement=e.get(4);
					 AndroidElement sixthElement=e.get(5);
					 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
					 int fromXLocation=sixthElement.getLocation().x;
					 int toXLocation=firdelement.getLocation().x;
					 
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("4th scroll done"); 
				 }
				 filter_options.get(i).click();
					//	 Actions crop = new Actions(driver);
					//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
					//	 Thread.sleep(10000);
						 Thread.sleep(5000);
						 apply_filter.click();
						 wait(save_img_view);
					
						 eyes.checkWindow(i+" filter after 4th scroll");
						 undo(i+6,undo);
						 footer_options.get(1).click();
							 System.out.println("i="+i); 

				 		 
			 } 
		 }
		 @Test
		  public void H_Testcase8() throws MalformedURLException, InterruptedException, URISyntaxException {
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 
			 for(int i=0;i<5;i++) {
				 for(int j=0;j<5;j++) {
					 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
					 AndroidElement firdelement=e.get(0);
					 AndroidElement secondElement=e.get(1);
					 AndroidElement thirdElement=e.get(2);
					 AndroidElement fourthElement=e.get(3);	
					 AndroidElement fifthElement=e.get(4);
					 AndroidElement sixthElement=e.get(5);
					 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
					 int fromXLocation=sixthElement.getLocation().x;
					 int toXLocation=firdelement.getLocation().x;
					 
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("5th scroll done"); 
				 }
				 filter_options.get(i).click();
					//	 Actions crop = new Actions(driver);
					//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
					//	 Thread.sleep(10000);
						 Thread.sleep(5000);
						 apply_filter.click();
						 wait(save_img_view);
					
						 eyes.checkWindow(i+" filter after 5th scroll");
						 undo(i+11,undo);
						 footer_options.get(1).click();
							 System.out.println("i="+i); 

				 		 
			 } 
		 }
		 @Test
		  public void I_Testcase9() throws MalformedURLException, InterruptedException, URISyntaxException {
			 
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
		
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 MobileElement close_filter_view=element2.close_filter_view;
			 close_filter_view.click();
			 close_editor.click();
			 forward_icon.click();
			 Thread.sleep(5000);
			 footer_options.get(1).click();
			 for(int i=0;i<5;i++) {
				 for(int j=0;j<6;j++) {
					 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
					 AndroidElement firdelement=e.get(0);
					 AndroidElement secondElement=e.get(1);
					 AndroidElement thirdElement=e.get(2);
					 AndroidElement fourthElement=e.get(3);	
					 AndroidElement fifthElement=e.get(4);
					 AndroidElement sixthElement=e.get(5);
					 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
					 int fromXLocation=sixthElement.getLocation().x;
					 int toXLocation=firdelement.getLocation().x;
					 
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("6th scroll done"); 
				 }
				 filter_options.get(i).click();
					//	 Actions crop = new Actions(driver);
					//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
					//	 Thread.sleep(10000);
						 Thread.sleep(5000);
						 apply_filter.click();
						 wait(save_img_view);
					
						 eyes.checkWindow(i+" filter after 6th scroll");
						 undo(i,undo);
						 footer_options.get(1).click();
							 System.out.println("i="+i); 

				 		 
			 } 
		 }
		 @Test
		  public void J_Testcase10() throws MalformedURLException, InterruptedException, URISyntaxException {
			 System.out.println("initialization"); 
			 Filter_view element2= new  Filter_view((AndroidDriver) driver);
				
				
			 List<MobileElement> footer_options=element2.footer_options;
	
			 //Open Eyes and start visual testing
			
			 List<MobileElement> filter_options=element2.filter_options;
			 MobileElement undo=element2.undo;
	//		 MobileElement cropTracker=element2.image_view;
			 MobileElement apply_filter=element2.apply_filter;
			 MobileElement close_editor=element2.back_view;
			 System.out.println("initialization 2"); 
			  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 MobileElement forward_icon=element1.forward_icon;
		
			// TouchAction actions=new TouchAction(driver);
			 //actions.cr
			 MobileElement save_img_view=element2.save_img_view;
		//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
			 System.out.println("before  loop"); 
			 Thread.sleep(10000);
			 for(int i=0;i<6;i++) {
				 for(int j=0;j<7;j++) {
					 System.out.println("inside loop"); 
					 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
					 AndroidElement firdelement=e.get(0);
					 AndroidElement secondElement=e.get(1);
					 AndroidElement thirdElement=e.get(2);
					 AndroidElement fourthElement=e.get(3);	
					 AndroidElement fifthElement=e.get(4);
					 AndroidElement sixthElement=e.get(5);
					 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
					 int fromXLocation=sixthElement.getLocation().x;
					 int toXLocation=firdelement.getLocation().x;
					 System.out.println("scroll tried"); 
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println("7th scroll done"); 
				 }
				 filter_options.get(i+1).click();
					//	 Actions crop = new Actions(driver);
					//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
					//	 Thread.sleep(10000);
						 Thread.sleep(5000);
						 apply_filter.click();
						 wait(save_img_view);
					
						 eyes.checkWindow(i+" filter after 7th scroll");
						 undo(i+6,undo);
						 footer_options.get(1).click();
							 System.out.println("i="+i); 

				 		 
			 } 
			 
			 MobileElement close_filter_view=element2.close_filter_view;

			 close_filter_view.click();
		 }*/
		 public void undo(int i,MobileElement undo) {
			 for(int j=0;j<=i;j++) {
				 undo.click();
				 System.out.println("undodone"+i+"times"); 
			 }
			
		 }
	/*  @AfterClass
		    public void teardown() {
			  eyes.close();
		        System.out.println("closed window");
		        //Abort eyes if it is not closed
		        eyes.abortIfNotClosed();
		    }*/
	}


