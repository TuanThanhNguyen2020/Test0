package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_Events {
	public Home_Animation_Events(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=0]")
	public WebElement EventsTitle;
	
	@AndroidFindBy(id="io.appium.android.apis:id/startButton")
	public WebElement StarButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/cancelButton")
	public WebElement CancelButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/endButton")
	public WebElement EndButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/endCB")
	public WebElement EndImButton;
	
}
