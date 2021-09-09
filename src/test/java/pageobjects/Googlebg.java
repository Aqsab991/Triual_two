package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Googlebg {

	public Googlebg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(xpath="//android.widget.TextView[@text='Categories']")
	
	public MobileElement category_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Popular']")

public MobileElement Popular_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='OCEANS']")

public MobileElement ocean_category;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvClose")
public MobileElement close_btn;
@AndroidFindBy(id="android:id/search_bar")

public MobileElement gl_searchbar;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/search_action_full")

public MobileElement gl_searchbutton;

@AndroidFindBy(id="android:id/search_close_btn")

public MobileElement gl_searchclosebutton;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivImage")
public List<MobileElement> Google_ocean_cat_images;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvUse")

public MobileElement apply_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivClose")

public MobileElement close_btn2;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivDownload")

public MobileElement download_img;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Sunset']")


public MobileElement sunset_cat;




}
