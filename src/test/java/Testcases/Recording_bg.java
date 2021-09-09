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

public class Recording_bg extends baseclasstwo{
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
		 Thread.sleep(10000);
			 System.out.println("TC 1 started executing"); 
			 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
			 List<MobileElement> bg_options=element2.gradient_option;
			 
		//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
			 List<MobileElement> categories=element2.categories;
			
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
					
				 
				 AndroidElement firdelement=e.get(0);
				 
				 AndroidElement fourthElement=e.get(3);	
			//	 AndroidElement fifthElement=e.get(4);	
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
				 MobileElement recording=(MobileElement) element2.recording;
				 recording.click();
			 System.out.println("Recording cat being selected"); 
	for(int j=0;j<4;j++) {
				 
				 bg_options.get(j).click();
				 if(j==0) {
					 Thread.sleep(7000);}
					 else {
						 System.out.println("Don't wait");
					 }
				 System.out.println(" bg being selected"); 
				
				 eyes.checkWindow("Bg in "+j+" Recording cat ");
	}
	/*		Thread.sleep(10000);
				 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
				 AndroidElement firdelement1=e1.get(0);
				 AndroidElement secondElement1=e1.get(1);
				 AndroidElement thirdElement1=e1.get(2);
				 AndroidElement fourthElement1=e1.get(3);	
				 AndroidElement fifthElement1=e1.get(4);	
				 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
				 int fromXLocation1=fourthElement1.getLocation().x;
				 int toXLocation1=firdelement1.getLocation().x;
				 						
				 TouchAction  action1 =new TouchAction(driver);
				 action1.press(PointOption.point(fromXLocation1, midOfY1))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation1, midOfY1))
				 .release()
				 .perform();
				 System.out.println(" scroll done"); 
		
					 for(int j=0;j<4;j++) {
				 
				 bg_options.get(j).click();
				
			//	 eyes.checkWindow("Bg "+j+"in 2nd set Screen");
					 }
				
		 }*/
		 

}
	 
@Test
public void B_Testcase2() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 List<MobileElement> categories=element2.categories;
	 List<MobileElement> bg_options=element2.gradient_option;
	 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 System.out.println("Frames cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
	 eyes.checkWindow("Bg "+j+" in Frames cat");
}
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
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
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j+1).click();
		
		 
		 eyes.checkWindow("Bg "+j+" in 2nd set of Frames cat");
 }
	 
	
}
@Test
public void C_Testcase3() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
//	 List<MobileElement> categories=element2.categories;
	 List<MobileElement> bg_options=element2.gradient_option;
	
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	 
	 System.out.println("Stroke cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
		 Thread.sleep(15000);}
		 else {
			 System.out.println("Don't wait");
		 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Stroke cat");
}
	/* List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement fe=e1.get(0);
	
	 AndroidElement foue=e1.get(3);	
		
	 int middleofY =foue.getLocation().y +(foue.getSize().height/2);
	 int fromX=foue.getLocation().x;
	 int toXn=fe.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromX+60, middleofY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXn, middleofY))
	 .release()
	 .perform();
	 
	 System.out.println(" scroll done"); 
	 for(int j=0;j<2;j++) {
		 
		 bg_options.get(j+3).click();
		
		 
	//	 eyes.checkWindow("Bg "+j+"in "+i+"2nd set Screen");
 }
	*/ 
	
}

@Test
public void D_Testcase4() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;

	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 System.out.println("Space Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(15000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Space Cat");
}
	 for(int i=0;i<1;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);

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
	 
	 System.out.println(" scroll done"); 
for(int j=0;j<4;j++) {
		 
		 bg_options.get(j+1).click();
		
		 
		 eyes.checkWindow("Bg "+j+" in 2nd set of Space Cat");
 
	 
	 }
	 
	 }
}

@Test
public void E_Testcase5() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 System.out.println("Wall Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg in Wall Cat");
}
	 for(int i=0;i<1;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);
		
	 AndroidElement fifthElement=e.get(4);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/3);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action =new TouchAction(driver);
	 action.press(PointOption.point(fromXLocation, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
	 System.out.println(" scroll done"); 

for(int j=0;j<4;j++) {
		 
		 bg_options.get(j+1).click();
		
		 
		 eyes.checkWindow("Bg "+j+" in 2nd set of Wall Cat");
 
	 
	 }
	 }
}

@Test
public void F_Testcase6() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 
	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 System.out.println("Creative Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
	 eyes.checkWindow("Bg "+j+" in Creative Cat");
}
	 
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fourthElement=e.get(3);	
	
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
	 
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j+2).click();
			
			 
			 eyes.checkWindow("Bg "+j+" in 2nd set of Creative Cat");
	 }
	
	 
	 }

@Test
public void G_Testcase7() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 System.out.println("Grafitti Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(12000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Grafitti Cat");
}
	 
	 for(int i=0;i<1;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
		 AndroidElement firdelement=e.get(0);
		
		 AndroidElement fourthElement=e.get(3);	
		 AndroidElement fifthElement=e.get(4);
		 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/3);
		 int fromXLocation=fifthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 
		 System.out.println(" scroll done"); 
		 for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			
			 
			 eyes.checkWindow("Bg "+j+" in 2nd set Grafitti Cat");
	 
		 
		 }
		 
		 }
	 
	 }
@Test
public void H_Testcase8() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 
	 List<MobileElement> bg_options=element2.gradient_option;
	 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
	 AndroidElement firdelement1=e1.get(0);
	
	 AndroidElement fourthElement1=e1.get(3);	
	// AndroidElement fifthElement=e.get(4);	
	 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
	 int fromXLocation1=fourthElement1.getLocation().x;
	 int toXLocation1=firdelement1.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation1, midOfY1))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation1, midOfY1))
	 .release()
	 .perform();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 System.out.println("Texture Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
	 eyes.checkWindow("Bg "+j+" in Texture Cat");
}
	 
	 for(int i=0;i<3;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
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
		 if(i==2) {
			 for(int j=0;j<3;j++) {
				 
				 bg_options.get(j+2).click();
				
				 
				 eyes.checkWindow("Bg "+j+" in "+i+"set of Texture Cat");
		 }
		 }
		 else
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 
		//	 eyes.checkWindow("Bg "+j+"in "+i+"2nd set Screen");
	 }
		 
		 }
	 
	 }
@Test
public void I_Testcase9() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 System.out.println("Split Up Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Split Up Cat");
}
	 
	 
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
		 AndroidElement firdelement=e.get(0);

		 AndroidElement fourthElement=e.get(3);	

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
	
		 for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			
			 
			 eyes.checkWindow("Bg "+j+" in 2nd set of Split Up Cat");
	 }
		 
		 }
	 
@Test
public void J_Testcase10() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 System.out.println("Drip Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Drip Cat");
}
	 
	 for(int i=0;i<2;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
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
		 if(i==1) {
			 for(int j=0;j<4;j++) {
				 
				 bg_options.get(j+1).click();
				
				 
				 eyes.checkWindow("Bg "+j+" in "+i+" set Screen of Drip Cat");
		 }
		 }
		 else {
	
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 
			 eyes.checkWindow("Bg "+j+" in "+i+" set Screen of Drip Cat");
	 }
		 }
		 }
	 
}
@Test
public void K_Testcase11() throws InterruptedException {
	 
	
		 System.out.println("TC 2 started executing"); 
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);

	
		 MobileElement wall=(MobileElement) element2.Wall;
		 wall.click();
		 System.out.println("Wall cat being selected"); 
for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			 if(j==0) {
				 Thread.sleep(7000);}
				 else {
					 System.out.println("Don't wait");
				 }
			 System.out.println(" bg being selected"); 
			
			 eyes.checkWindow("Bg "+j+" in Wall cat");
}

	 

}
@Test
public void L_Testcase12() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	/* List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
	 AndroidElement firdelement1=e1.get(0);
	 AndroidElement secondElement1=e1.get(1);
	 AndroidElement thirdElement1=e1.get(2);
	 AndroidElement fourthElement1=e1.get(3);	
	// AndroidElement fifthElement=e.get(4);	
	 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/3);
	 int fromXLocation1=fourthElement1.getLocation().x;
	 int toXLocation1=firdelement1.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation1, midOfY1))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation1, midOfY1))
	 .release()
	 .perform();*/
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 System.out.println("Newspaper Cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(5000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Newspaper Cat");
}

	 
}
@Test
public void M_Testcase13() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 System.out.println("Solid Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(20000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Solid Cat");
}
	 
	 for(int i=0;i<5;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
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
		 if(i==4) {
			 for(int j=0;j<5;j++) {
				 
				 bg_options.get(j).click();
				
				 
				 eyes.checkWindow("Bg "+j+" in "+i+" set of Solid Cat");
		 }
		 }
		 else {
	
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 
			 eyes.checkWindow("Bg "+j+" in "+i+" set of Solid Cat");
	 }
		 }
		 }
	 
}
@Test
public void N_Testcase14() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 System.out.println("Clouds Cat being selected"); 
 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(15000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Clouds Cat");
}
	 for(int i=0;i<1;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);

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
	 
	 System.out.println(" scroll done"); 
for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			
			 
			 eyes.checkWindow("Bg"+j+" in 2nd set of Clouds Cat");
	 
		 
		 }
		 }
	 
}
@Test
public void O_Testcase15() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 System.out.println("ColorCombo Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in ColorCombo Cat");
}
	 
	 
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
		 AndroidElement firdelement=e.get(0);

		 AndroidElement fourthElement=e.get(3);	
	
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
		 for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			
			 
			 eyes.checkWindow("Bg"+j+" in 2nd set of ColorCombo Cat");
	 
		 
		 }
		 }
	 

@Test
public void P_Testcase16() throws InterruptedException {
	
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement window=(MobileElement) element2.window;
	 window.click();
	 System.out.println("Window being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Window");
}
	 
	 for(int i=0;i<2;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
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
		 
		 if(i==1) {
			 for(int j=0;j<3;j++) {
				 
				 bg_options.get(j+2).click();
				
				 
				 eyes.checkWindow("Bg "+j+" in "+i+" set of Window");
		 }
		 }
		 else {
			 for(int j=0;j<4;j++) {
				 
				 bg_options.get(j).click();
				
				 
				 eyes.checkWindow("Bg "+j+" in "+i+" set of Window");
		 
			 
			 }
		 }
		 }
	 
}

@Test
public void Q_Testcase17() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement painting_cat=(MobileElement) element2.painting_cat;
	 painting_cat.click();
	 System.out.println("Painting Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Painting Cat");
}

	 
}
@Test
public void R_Testcase18() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement Papertorn=(MobileElement) element2.papertorn_cat;
	 Papertorn.click();
	 System.out.println("Papertorn Cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Papertorn Cat");
}

}
@Test
public void S_Testcase19() throws InterruptedException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 MobileElement text=(MobileElement) element2.text_cat;
	 text.click();
	 System.out.println("Text Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		 eyes.checkWindow("Bg "+j+" in Text Cat");
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
