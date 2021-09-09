package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Gallery {
	public Gallery(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.sec.android.gallery3d:id/thumbnail")
	public List<MobileElement> gallery_image;
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Gallery']")
	
	public MobileElement architecture_tab;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Albums']")

public MobileElement albums_tab;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Pictures']")

public MobileElement pic_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Downloads']")

public MobileElement download_folder;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Background_Images']")

public MobileElement bg_images_folder;

//com.sec.android.gallery3d:id/thumbnail



	
	
}
