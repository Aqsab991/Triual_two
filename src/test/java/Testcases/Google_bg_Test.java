package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;

import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import pageobjects.EditImageScreen;
import pageobjects.Googlebg;
import pageobjects.Home_page;
import pageobjects.pxbg;

public class Google_bg_Test extends baseclasstwo{
	 @Test
	  public void A_Testcase1() throws InterruptedException {
		  Thread.sleep(5000);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement gradient_tab=  element1.gradient_tab;
		  MobileElement category_tab=element2.category_tab;
	
		
			
		 gradient_tab.click();
			 
			 px_layout.get(1).click();
			 if(category_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:1 Google bg is displayed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open Google bg");
				}
	  }
	  @Test
	  public void B_Testcase2() throws InterruptedException {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		//  List<MobileElement> px_layout=element1.Px_layout;
		 // MobileElement arch_tab=element1.architecture_tab;
		  Googlebg element2=new  Googlebg((AndroidDriver)driver);
		  MobileElement close_btn=element2.close_btn;
			MobileElement Searchbar=element1.search_bar;
			
			close_btn.click();
		  
		//  wait(Searchbar);
			Thread.sleep(10000);
		  if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("Test case 2 is executed successfully-back to edit screen!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close PX bg");
				}
		  
	  }
	  @Test
	  public void C_Testcase3(){
	//		WebDriverWait wait=new WebDriverWait(driver,60);
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout")));
	 
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  px_layout.get(1).click();
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.gl_searchbar;
		  MobileElement Searchclosebutton=element2.gl_searchclosebutton;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));
		//	((AndroidDriver)driver).pressKeyCode(66);
			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		Searchclosebutton.click();
		 System.out.println("text in search bar: "+Searchbar.getText());
		  String empty="";
		  if(Searchbar.getText().equals(empty)) {
				 
				 System.out.println("Test case 3 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}

	  }
	  @Test
	  public void D_Testcase4(){
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.gl_searchbar;
		
		  MobileElement Searchbutton=element2.gl_searchbutton;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));

			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.M));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 System.out.println("text in search bar: "+Searchbar.getText());
		 Searchbutton.click();

		  if(driver.findElementById("com.vyroai.AutoCutCut:id/progress_loader").isDisplayed()) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}
		 

	  }
	  @Test
	  public void E_Testcase5() throws InterruptedException {
		 
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		//  MobileElement ocean_category=element2.ocean_category;
		  List<MobileElement> ocean_cat_images=element2.Google_ocean_cat_images;
		  MobileElement apply_images=element2.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
			ocean_cat_images.get(2).click();
		  wait(apply_images);
		  apply_images.click();
		  wait(Searchbar);
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("TC:05 Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		
		  
	  }
	  @Test
	  public void F_Testcase6() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement ocean_category=element2.ocean_category;
		  List<MobileElement> px_cat_images=element2.Google_ocean_cat_images;
		  List<MobileElement> px_layout=element1.Px_layout;
		  MobileElement gradient_tab=element1.gradient_tab;
		  gradient_tab.click();
		  px_layout.get(1).click();
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  MobileElement download_images=element2.download_img;
		  
		  ocean_category.click();
		  wait(px_cat_images.get(1));
		  px_cat_images.get(1).click();
		  wait(download_images);
		  download_images.click();
			String Empty="Image Saved";
	         
	       	  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");	  
	       	  System.out.println(toastMessage);
	       	if(toastMessage.contains(Empty)) {
	        	System.out.println("TC:06 Image is successfully saved in gallery");	
	       	  
	       	}
	       	else {
	       		AssertJUnit.assertTrue(false);
	   			System.out.println("Tch tch Failed ;(");
	       	}
		
		  
	  }
	  @Test
	  public void G_Testcase7() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		
		  MobileElement cancel_images=element2.close_btn2;
		
		  MobileElement cat_tab=element2.category_tab;

		  cancel_images.click();
	 if(cat_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:07 Image is closed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open PX bg");
				}
		  
	  }
	  @Test
	  public void H_Testcase8() {

		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		
		  MobileElement cancel_images=element2.close_btn;
		
		  MobileElement cat_tab=element2.ocean_category;

		  cancel_images.click();
	 if(cat_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:08 Category is closed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close bg category");
				}
		  
	  }
	  @Test
	  public void I_Testcase9() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Google_ocean_cat_images;
		  MobileElement apply_images=element2.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  MobileElement ocean_category=element2.ocean_category;
		  ocean_category.click();
		  wait(px_cat_images.get(1));
		  px_cat_images.get(4).click();
		  MobileElement cancel_images=element2.close_btn2;
		  cancel_images.click();
		  px_cat_images.get(1).click();
		  wait2(apply_images);
		  apply_images.click();
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("TC:09 Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		  
	  }
	  @Test
	  public void J_Testcase10() {
		  
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement popular_tab=element2.Popular_tab;
		  MobileElement sunset_cat=element2.Popular_tab;
		 
		//	 wait(Searchbar);
			 MobileElement gradient_tab=element1.gradient_tab;
			  gradient_tab.click();
			  px_layout.get(1).click();
			  System.out.println("image view opened");
			  
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			popular_tab.click();
			 if(sunset_cat.isDisplayed()==true) {
				 
				 System.out.println("TC:10 Successfully navigated to popular cat !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to to open popular category");
				}
	  }
	  @Test
	  public void K_Testcase11() {
		  
	//	  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement sunset_cat=element2.sunset_cat;
		  List<MobileElement> px_cat_images=element2.Google_ocean_cat_images;



		  sunset_cat.click();
		  WebDriverWait wait=new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));

		  MobileElement download_images=element2.download_img;

		  px_cat_images.get(5).click();
		  wait(download_images);
		  download_images.click();
			String Empty="Image Saved";
	         
	       	  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");	  
	       	  System.out.println(toastMessage);
	       	if(toastMessage.contains(Empty)) {
	        	System.out.println("TC:11 Image is successfully saved in gallery");	
	       	  
	       	}
	       	else {
	       		AssertJUnit.assertTrue(false);
	   			System.out.println("Tch tch Failed ;(");
	       	}
	  }
	  @Test
	  public void L_Testcase12() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		
		  MobileElement cancel_images=element2.close_btn2;
		
		  MobileElement cat_tab=element2.category_tab;

		  cancel_images.click();
	 if(cat_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:12 Image is closed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("close button not working");
				}
		  
	  }
	  @Test
	  public void M_Testcase13() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Google_ocean_cat_images;
		  MobileElement apply_images=element2.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  MobileElement gradient_tab=element1.gradient_tab;

		  px_cat_images.get(1).click();
		  wait(apply_images);
		  apply_images.click();
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("Tc:13Woohoo Success bg applied :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
			 gradient_tab.click();
		  
	  }

}
