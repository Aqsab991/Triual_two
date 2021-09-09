package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
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
import pageobjects.Home_page;
import pageobjects.pxbg;
import io.appium.java_client.android.nativekey.*;

public class Edit_image_test extends BaseClass{

	  @Test
	  public void A_Testcase1() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  element1.cancel_btn.click();
		  Home_page element=new Home_page((AndroidDriver) driver);
			//	EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			
				MobileElement download_folder_name=element.Download_Folder;
				wait(download_folder_name);
				 if(download_folder_name.isDisplayed()==true) {
						System.out.println("Woohoo Success :D ");
					}
					else {
						AssertJUnit.assertTrue(false);
						System.out.println("Tch tch Failed ;(");
					}
	  }
	  @Test
	  public void B_Testcase2() {
		  Home_page element=new Home_page((AndroidDriver) driver);
		  List<MobileElement> images=element.images;
		  images.get(0).click();
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  MobileElement arch_tab=element2.architecture_tab;
	
		
			MobileElement Searchbar=element1.search_bar;
		 
			 wait(Searchbar);
			 px_layout.get(0).click();
			 if(arch_tab.isDisplayed()==true) {
				 
				 System.out.println("Px bg is displayed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open PX bg");
				}
	  }
	  @Test
	  public void C_Testcase3() {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		//  List<MobileElement> px_layout=element1.Px_layout;
		 // MobileElement arch_tab=element1.architecture_tab;
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  MobileElement close_btn=element2.close_btn;
			MobileElement Searchbar=element1.search_bar;
			
			close_btn.click();
		  
		  wait(Searchbar);
		  if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("Test case 3 is executed successfully-back to edit screen!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close PX bg");
				}
		  
	  }
	  @Test
	  public void D_Testcase4(){
	//		WebDriverWait wait=new WebDriverWait(driver,60);
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout")));
	 
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  px_layout.get(0).click();
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.px_searchbar;
		  MobileElement Searchclosebutton=element2.px_searchclosebutton;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));
		//	((AndroidDriver)driver).pressKeyCode(66);
			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		Searchclosebutton.click();
		 System.out.println("text in search bar: "+Searchbar.getText());
		  String empty="";
		  if(Searchbar.getText().equals(empty)) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}

	  }
	  @Test
	  public void E_Testcase5(){
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.px_searchbar;
		
		  MobileElement Searchbutton=element2.px_searchbutton;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));

			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.M));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 System.out.println("text in search bar: "+Searchbar.getText());
		 Searchbutton.click();

		  if(driver.findElementById("com.vyroai.AutoCutCut:id/progress_loader").isDisplayed()) {
				 
				 System.out.println("Test case 5 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}
		 

	  }
	  @Test
	  public void F_Testcase6() throws InterruptedException {
		 
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Px_cat_images;
		  MobileElement apply_images=element2.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
		  px_cat_images.get(2).click();
		  wait(apply_images);
		  apply_images.click();
		  wait(Searchbar);
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		
		  
	  }
	  @Test
	  public void G_Testcase7() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Px_cat_images;
		  List<MobileElement> px_layout=element1.Px_layout;
		  MobileElement gradient_tab=element1.gradient_tab;
		  gradient_tab.click();
		  px_layout.get(0).click();
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  MobileElement download_images=element2.download_img;
		
		  px_cat_images.get(1).click();
		  wait(download_images);
		  download_images.click();
			String Empty="Image Saved";
	         
	       	  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");	  
	       	  System.out.println(toastMessage);
	       	if(toastMessage.contains(Empty)) {
	        	System.out.println("Image is successfully saved in gallery");	
	       	  
	       	}
	       	else {
	       		AssertJUnit.assertTrue(false);
	   			System.out.println("Tch tch Failed ;(");
	       	}
		
		  
	  }
	  @Test
	  public void H_Testcase8() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		
		  MobileElement cancel_images=element2.close_btn2;
		
		  MobileElement arch_tab=element2.architecture_tab;

		  cancel_images.click();
	 if(arch_tab.isDisplayed()==true) {
				 
				 System.out.println("Image is closed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open PX bg");
				}
		  
	  }

	  @Test
	  public void I_Testcase9() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Px_cat_images;
		  MobileElement apply_images=element2.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  px_cat_images.get(1).click();
		  wait(apply_images);
		  apply_images.click();
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		  
	  }
	  /*
	  @Test
	  public void C_PXBGValid() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_cat_images=element1.Px_cat_images;
		  MobileElement download_images=element1.download_img;
		  MobileElement Searchbar=element1.search_bar;
		  px_cat_images.get(1).click();
		  wait(download_images);
		  download_images.click();
			String Empty="Image Saved";
	         
	       	  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");	  
	       	  System.out.println(toastMessage);
	       	if(toastMessage.contains(Empty)) {
	        	System.out.println("Image is successfully saved in gallery");	
	       	  
	       	}
	       	else {
	       		Assert.assertTrue(false);
	   			System.out.println("Tch tch Failed ;(");
	       	}
		
		  
	  }
	  @Test
	  public void D_PXBGInvalid() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		
		  MobileElement cancel_images=element1.close_btn2;
		
		  MobileElement arch_tab=element1.architecture_tab;

		  cancel_images.click();
	 if(arch_tab.isDisplayed()==true) {
				 
				 System.out.println("Image is closed !!!");
				}
				else {
					Assert.assertTrue(false);
					System.out.println("Failed to open PX bg");
				}
		  
	  }

	  @Test
	  public void E_PXBGValid() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_cat_images=element1.Px_cat_images;
		  MobileElement apply_images=element1.apply_btn;
		  MobileElement Searchbar=element1.search_bar;
		  px_cat_images.get(2).click();
		  wait(apply_images);
		  apply_images.click();
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("Woohoo Success :D ");
				}
				else {
					Assert.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		  
	  }*/
	/*  @Test
	  public void PXBG_invalid_C() {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  MobileElement arch_tab=element1.architecture_tab;
		  MobileElement close_btn=element1.close_btn;
			MobileElement Searchbar=element1.search_bar;
			
			close_btn.click();
		  
		  
		  if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("Test case 3 is executed successfully-back to edit screen!!!");
				}
				else {
					Assert.assertTrue(false);
					System.out.println("Failed to close PX bg");
				}
		  
	  }
	  @Test
	  public void PXBG_search_invalid_D() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout")));
	 
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
	//	  List<MobileElement> px_layout=element1.Px_layout;
	//	  MobileElement arch_tab=element1.architecture_tab;
	//	  MobileElement close_btn=element1.close_btn;
	//		MobileElement Searchbar=(MobileElement) driver.findElementsByAccessibilityId("Search");
			MobileElement Searchbutton=(MobileElement) driver.findElementByXPath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout");
	//		MobileElement Searchclosebutton=element1.px_searchclosebutton;
		
			Searchbar.click();
		  Searchbar.sendKeys("rumi");
		  Searchclosebutton.click();
		  
		  System.out.println("text in search bar: "+Searchbar.getText());
		  String empty="";
		  if(Searchbar.getText().equals(empty)) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					Assert.assertTrue(false);
					System.out.println("Failed");
				}
		  
	  }*/
	  
	
}
