package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_Reversing {
	public Home_Animation_Reversing(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=0]")
	private WebElement ReversingTitle;
	public void getReversingTitle(){
		System.out.println(ReversingTitle.getText());
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/startButton")
	public WebElement PlayButton;

	@AndroidFindBy(id="io.appium.android.apis:id/reverseButton")
	public WebElement ReverseButton;
}
