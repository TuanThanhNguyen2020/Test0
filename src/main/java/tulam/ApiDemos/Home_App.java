package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_App {
	public Home_App(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver) , this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Action Bar']")
	public WebElement ActionBar;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Activity']")
	public WebElement Activity;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Alarm']")
	public WebElement Alarm;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Device Admin']")
	public WebElement DeviceAdmin;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Fragment']")
	public WebElement Fragment;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Launcher Shortcuts']")
	public WebElement LauncherShortcuts;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Loader']")
	public WebElement Loader;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Menu']")
	public WebElement Menu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Notification']")
	public WebElement Notification;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Search']")
	public WebElement Search;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Service']")
	public WebElement Service;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Text-To-Speech']")
	public WebElement TextToSpeech;
}
