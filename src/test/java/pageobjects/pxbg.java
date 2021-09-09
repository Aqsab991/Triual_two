package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pxbg {
	public pxbg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Architecture']")
	
	public MobileElement architecture_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Cars']")

public MobileElement car_tab; 

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")

public MobileElement close_btn;

@AndroidFindBy(id="android:id/search_bar")

public MobileElement px_searchbar;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/search_action_full")

public MobileElement px_searchbutton;

@AndroidFindBy(id="android:id/search_close_btn")

public MobileElement px_searchclosebutton;
@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.ImageView")
public List<MobileElement> Px_cat_images;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvUse")

public MobileElement apply_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivClose")

public MobileElement close_btn2;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivDownload")

public MobileElement download_img;
}
