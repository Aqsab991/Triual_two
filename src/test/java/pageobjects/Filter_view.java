package pageobjects;


	import java.util.List;

	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class Filter_view {
		
		public Filter_view(AndroidDriver driver){
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

		public List<MobileElement> footer_options;
		
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveImageView")

		public MobileElement save_img_view;
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

		public MobileElement back_view;
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/textViewRotate")

		public MobileElement scroll_textview;
		
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cropRecycler")

		public MobileElement crop_recyclerview;
		
		@AndroidFindBy(xpath="//com.vyroai.AutoCutCut:id/text[@text='Crop']")

		public MobileElement crop_view;

		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

		public MobileElement close_filter_view;

		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

		public MobileElement apply_filter;

		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

		public MobileElement undo;
		

		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/rotateScrollWheel")

		public MobileElement scrollwheel;
		
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/itemIcon")

		public List<MobileElement> filter_options;
		
		@AndroidFindBy(id="com.vyroai.AutoCutCut:id/image_view_crop")

		public MobileElement image_view;
		
		

		

		

	}


