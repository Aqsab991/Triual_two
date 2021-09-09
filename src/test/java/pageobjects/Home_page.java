package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_page {

	
	public Home_page(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_album")
	
	public MobileElement gallery_home;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_camera")
	
	public MobileElement camera_home;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_creation")

public MobileElement creations_home;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/albumText")

public MobileElement Home;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Download']")

public MobileElement Downloads;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvCancel")

public MobileElement close_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivCarrot")

public MobileElement Dropdown;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Folders']")

public MobileElement Folder;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Download']")

public MobileElement Download_Folder;
@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout")

public List<MobileElement> images;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Person']")

public MobileElement Person;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Object']")

public MobileElement Object;


@AndroidFindBy(id="com.vyroai.AutoCutCut:id/fabPerson")

public MobileElement float_person;
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/fabObject")

public MobileElement float_object;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")

public List<MobileElement> Object_seg;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")

public List<MobileElement> human_seg;


}
