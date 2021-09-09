package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Stickres_pg;
import pageobjects.Structures_pg;

public class Stickers_test extends baseclasstwo {

	 @Test
	  public void A_Testcase1() throws InterruptedException {
		 Thread.sleep(30000);
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement undo=element2.undo;
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/iconImage\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(4);	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 System.out.println(" scroll done"); 
	//	 wait(footer_options.get(2));
		 footer_options.get(3).click();
		 
	//	 List<MobileElement>  footer=driver.findElementsById("com.vyroai.AutoCutCut:id/footerView");
	//	System.out.println("no.of items : "+ footer.size()); 
		 
		 MobileElement  close_structure_view=element2.close_structure_view;
		 
		 if( close_structure_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Stickers view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		
		 
	 }
/*	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
				 
		 MobileElement  close_structure_view=element2.close_structure_view;
		

		 
		 MobileElement save_img_view=element2.save_btn;
		 close_structure_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,Structures view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close Structures");
		 	}
		 
		 
		 
	 }
	 @Test
	  public void C_Testcase3() throws InterruptedException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 footer_options.get(3).click();
		 stickers.get(1).click();
		    Thread.sleep(10000);
	 }
	 @Test
	  public void D_Testcase4() throws InterruptedException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 List<MobileElement> sticker_options=element2.sticker_options;
		 
		 sticker_options.get(2).click();
		 stickers.get(0).click();
		    Thread.sleep(10000);
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> sticker_options=element2.sticker_options;
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(2);	
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
		 stickers.get(2).click();
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException {
		 
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 footer_options.get(3).click();
		 Dimension size = driver.manage().window().getSize();

	        int last = (int) (size.height/3);
	        System.out.println("height :"+size.height + "less than half" + last);
	        int last1 = (int) (size.height/2);
	        System.out.println("height :"+size.height + "less than half" + last1);
	        int xvalue = (int) (size.width/2);
	TouchAction action = new TouchAction(driver);
    action.longPress(new ElementOption().withElement(dragview))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
           .moveTo(PointOption.point(xvalue,last))
            .release()
            .perform();
    
    stickers.get(6).click();
    Thread.sleep(10000);
    
}
/*	 @Test
	  public void C_Testcase7() throws InterruptedException {
		 
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement footerview=element2.footer_view;
	//	 footer_options.get(4).click();
		 Thread.sleep(10000);
		 Dimension size = footerview.getSize();

	        int startX = size.width / 2;
	        int endX = startX;
	        int startY = (int) (size.height * 0.2);
	        int endY = (int) (size.height * 0.8);
System.out.println("startX :" + endX);
	        TouchAction t = new TouchAction(driver);
	        t.press(PointOption.point(startX, startY))
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	                .moveTo(PointOption.point(endX, endY))
	                .release()
	                .perform(); 
		 
	 }*/
	 @Test
	  public void G_Testcase7() throws InterruptedException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement apply=element2.apply_imageview;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
sticker_options.get(0).click();
sticker_options.get(0).click();
for(int j=0;j<2;j++) {
		 for (int i=0;i<15;i++) {
		
			 Dimension size = driver.manage().window().getSize();

		        int last = (int) (size.height/3);
		        System.out.println("height :"+size.height + "less than half" + last);
		        int last1 = (int) (size.height/2);
		        System.out.println("height :"+size.height + "less than half" + last1);
		        int xvalue = (int) (size.width/2);
		TouchAction action = new TouchAction(driver);
	    action.longPress(new ElementOption().withElement(dragview))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
	           .moveTo(PointOption.point(xvalue,last))
	            .release()
	            .perform();
			 stickers.get(i).click(); 

			 System.out.println(i + "sticker applied !!!");
			 Thread.sleep(10000);
			 apply.click();
//			 eyes.checkWindow("Filter "+i+" Screen");
			 undo(i,undo);
			 footer_options.get(3).click();
			 
		 }
		 Dimension size = driver.manage().window().getSize();

	        int last = (int) (size.height/3);
	        System.out.println("height :"+size.height + "less than half" + last);
	        int last1 = (int) (size.height/2);
	        System.out.println("height :"+size.height + "less than half" + last1);
	        int xvalue = (int) (size.width/2);
	TouchAction action = new TouchAction(driver);
 action.longPress(new ElementOption().withElement(dragview))
         .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
        .moveTo(PointOption.point(xvalue,last))
         .release()
         .perform();
         
 MobileElement ele=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/stickerViewpager");
 Dimension size1 = driver.manage().window().getSize();

 int startX = size1.width / 2;
 int endX = startX;
 int startY = (int) (size1.height * 0.8);
 int endY = (int) (size1.height * 0.1);

 TouchAction t = new TouchAction(driver);
 t.press(PointOption.point(startX, startY))
         .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
         .moveTo(PointOption.point(endX, endY))
         .release()
         .perform();
	 }
for (int i=0;i<11;i++) {
	
	 Dimension size = driver.manage().window().getSize();

       int last = (int) (size.height/3);
       System.out.println("height :"+size.height + "less than half" + last);
       int last1 = (int) (size.height/2);
       System.out.println("height :"+size.height + "less than half" + last1);
       int xvalue = (int) (size.width/2);
TouchAction action = new TouchAction(driver);
action.longPress(new ElementOption().withElement(dragview))
       .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
      .moveTo(PointOption.point(xvalue,last))
       .release()
       .perform();
	 stickers.get(i).click(); 

	 System.out.println(i + "sticker applied");
	 Thread.sleep(7000);
	 apply.click();
//	 eyes.checkWindow("Filter "+i+" Screen");
	 undo(i,undo);
	 footer_options.get(3).click();
	 
}

	 }
	 public void undo(int i,MobileElement undo) {
		 for(int j=0;j<=i;j++) {
			 undo.click();
			 System.out.println("undodone"+i+"times"); 
		 }
		
	 }
}