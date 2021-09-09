package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Magazine_pageobject {
	public Magazine_pageobject(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/downloadLay")
	

	public List<MobileElement> gradient_option;
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryItemLay")
	

	public List<MobileElement> categories;



@AndroidFindBy(xpath="//android.widget.TextView[@text='Texture']")


public MobileElement texture_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Newspaper']")


public MobileElement Newspaper_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Window']")


public MobileElement window;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Painting']")


public MobileElement painting_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='PaperTorn']")


public MobileElement papertorn_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='ColorCombo']")


public MobileElement colorcombo_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Text']")


public MobileElement text_cat;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Clouds']")


public MobileElement cloud;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Recording']")


public MobileElement recording;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Frames']")


public MobileElement Frames;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Solid']")


public MobileElement Solid;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Wall']")


public MobileElement Wall;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Drip']")


public MobileElement Drip;
@AndroidFindBy(xpath="//android.widget.TextView[@text='SplitUp']")


public MobileElement SplitUp;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Stroke']")


public MobileElement Stroke;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Space']")


public MobileElement Space;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Walls']")


public MobileElement Walls;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Creative']")


public MobileElement Creative;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Graffiti']")


public MobileElement Graffiti;


}
