
package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;

import org.testng.AssertJUnit;
import java.util.List;

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
import pageobjects.Home_page;

public class Home_object_Test extends baseclasstwo{
	
//	WebDriverWait wait=new WebDriverWait(driver,30);
	  @Test
	  public void A_Gallery_Invalid() {
		//	WebDriverWait wait=new WebDriverWait(driver,30);
		
		  //	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/albumText")));
//			MobileElement gallery_home=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/ic_folder_album");
//			gallery_home.click();
		//	Home_page element=new Home_page((AndroidDriver) driver);
	//		EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			Home_page element=new Home_page((AndroidDriver) driver);
		
			MobileElement folder=element.Folder;
			MobileElement Object=element.Object;
			wait(Object);
			Object.click();
			if(folder.isDisplayed()==true) {
       			System.out.println("Woohoo Success :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/albumText")));
			

			
	  }
	  @Test
	  public void B_Gallery_Invalid_B() {
		  Home_page element=new Home_page((AndroidDriver) driver);
	
			MobileElement Download_folder=element.Downloads;
			MobileElement drop_down=element.Dropdown;
			MobileElement folder=element.Folder;
		
			MobileElement download_folder_name=element.Download_Folder;
			MobileElement Object=element.Object;
			wait(Object);
			Object.click();
			Download_folder.click();
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/txt_FoldersNames")));
			wait(download_folder_name);
			drop_down.click();
			if(folder.isDisplayed()==true) {
       			System.out.println("Test case 2 passed :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}	
			
			
			
		  
	  }
	  
	  @Test
	  public void C_Gallery_Invalid() {
		  Home_page element=new Home_page((AndroidDriver) driver);
	//		EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  MobileElement drop_down=element.Dropdown;
		  MobileElement Object=element.Object;
			
		  MobileElement folder=element.Folder;
			drop_down.click();
		wait(folder);
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			
			if(Object.isDisplayed()==true) {
       			System.out.println("Woohoo Success :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}
		  
	  }
	  @Test
	  public void D_Gallery_Valid() {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		 
			MobileElement Person_float_btn=element.float_person;
			MobileElement Object_float_btn=element.float_object;
			MobileElement Object=element.Object;
			wait(Object);
			Object.click();
			Object_float_btn.click();
			if(Person_float_btn.isDisplayed()) {
				System.out.println("Human float button displayed !");
			}
			else {
				System.out.println("No float button !!");
			}
	  }
	  @Test
	  public void E_Gallery_Valid() {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 
			MobileElement Download_folder=element.Downloads;
		List<MobileElement> images=element.images;
			MobileElement download_folder_name=element.Download_Folder;
			MobileElement Searchbar=element1.search_bar;
			List<MobileElement> human_seg=element.human_seg;
			MobileElement Person_float_btn=element.float_person;
			
		
			Person_float_btn.click();
			if(Person_float_btn.isDisplayed()) {
				System.out.println("Human float button displayed !");
			}
			else {
				System.out.println("No float button !!");
			}
			Download_folder.click();
			
			wait(download_folder_name);
				
				 images.get(5).click();
				 wait(Searchbar);
				 String obje_cat= human_seg.get(2).getText();
					String studio="Neon";
					 if(obje_cat.equals(studio)) {
			
					 System.out.println("HUman segmentation mode!!"); 
				 }
				 else {
					 System.out.println("Not an Human segmentation mode!!"); 
				 }
				 
			}
	  
	  @Test
	  public void F_Gallery_Valid() {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
	
		List<MobileElement> images=element.images;
	
			MobileElement Searchbar=element1.search_bar;
			
			MobileElement Person_float_btn=element.float_person;
			MobileElement Object_float_btn=element.float_object;
			List<MobileElement> Object_seg=element.Object_seg;
			MobileElement close_btn=element.close_btn;
			close_btn.click();
			
			Person_float_btn.click();
			Object_float_btn.click();
			if(Object_float_btn.isDisplayed()) {
				System.out.println("Object float button displayed !");
			}
			else {
				System.out.println("No float button !!");
			}
			 images.get(1).click();
			 wait(Searchbar);
			String obje_cat= Object_seg.get(2).getText();
			String studio="Studio";
			 if(obje_cat.equals(studio)) {
				 System.out.println("Object segmentation mode!!"); 
			 }
			 else {
				 System.out.println("Not an Object segmentation mode!!"); 
			 }
				 
			}
	  
	  

	
	}