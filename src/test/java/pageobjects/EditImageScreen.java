package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditImageScreen {

	public EditImageScreen(AndroidDriver driver){
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/etSearch")
	
	public MobileElement search_bar;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/globalSeekbar")
	
	public MobileElement seek_bar;

	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvCancel")
	
	public MobileElement cancel_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivDownload")
	
	public MobileElement forward_icon;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/downloadLay")
	public List<MobileElement> Px_layout;
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Architecture']")
	
	public MobileElement architecture_tab;

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

@AndroidFindBy(xpath="//android.widget.TextView[@text='Gradients']")

public MobileElement gradient_tab;



}
