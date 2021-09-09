package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class adjustment_view_pg {
	public adjustment_view_pg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

	public List<MobileElement> footer_options;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveImageView")

	public MobileElement save_img_view;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

	public MobileElement close_overlay_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_overlay;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

	public MobileElement undo;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/glView")

	public MobileElement gl_view;

	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/titleName")

	public List<MobileElement> adjustments_options;

	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/intensitySlider")

	public MobileElement intensity_slider;

}
