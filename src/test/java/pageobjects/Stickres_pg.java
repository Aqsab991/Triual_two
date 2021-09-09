package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Stickres_pg {
	public Stickres_pg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

	public List<MobileElement> footer_options;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveImageView")

	public MobileElement save_img_view;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

	public MobileElement close_structure_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_structure;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

	public MobileElement undo;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/dragView")

	public MobileElement drag_view;

	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tabIconView")

	public List<MobileElement> sticker_options;


	
	@AndroidFindBy(xpath="//com.vyroai.AutoCutCut:id/categoryTV[@text='Save']")

	public MobileElement save_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_imageview;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/itemIcon")

	public List<MobileElement> stickers;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/compareClick")

	public MobileElement compare_button;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/footerView")

	public MobileElement footer_view;
	
}
