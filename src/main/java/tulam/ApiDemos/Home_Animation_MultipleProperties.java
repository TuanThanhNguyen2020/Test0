package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_MultipleProperties {
	public Home_Animation_MultipleProperties(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement LoadingTitle;
	public void getLoadingTitle(){
		System.out.println(LoadingTitle.getText());
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/startButton")
	public WebElement MPRunButton;
	
	
	
	
}
