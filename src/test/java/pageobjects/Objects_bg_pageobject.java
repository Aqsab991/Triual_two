package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Objects_bg_pageobject {
	public Objects_bg_pageobject(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/downloadLay")
	

	public List<MobileElement> gradient_option;
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryItemLay")
	

	public List<MobileElement> categories;



@AndroidFindBy(xpath="//android.widget.TextView[@text='Shadows']")


public MobileElement Shadows_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Studio']")


public MobileElement studio_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Split Color']")


public MobileElement Split_Color;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Artistic']")


public MobileElement Artistic;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Solid']")


public MobileElement Solid;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Hanger']")


public MobileElement hanger;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Wood']")


public MobileElement wood;
}
