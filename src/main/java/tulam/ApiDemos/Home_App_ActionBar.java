package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_App_ActionBar {
	public Home_App_ActionBar(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Action Bar Mechanics']")
	public WebElement ActionBarMechanics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Action Bar Tabs']")
	public WebElement ActionBarTabs;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Action Bar Usage']")
	public WebElement ActionBarUsage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Action Provider']")
	public WebElement ActionProvider;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Display Options']")
	public WebElement DisplayOptions;
	
}
