package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Accessibility_AccessibilityNodeProvider {
	public Home_Accessibility_AccessibilityNodeProvider(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//*[@text='Accessibility/Accessibility Node Provider']")
	public WebElement ANPTitle;
	
	@AndroidFindBy(xpath="(//android.widget.TextView)[2]")
	public WebElement ANPQuickIntro;

}
