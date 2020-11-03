package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_Cloning {
	public Home_Animation_Cloning(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath=("(//android.widget.TextView)[1]"))
	public WebElement ACloningTitle;
//	public void getACloningTitle(){
//		String text = ACloningTitle.getText();
//		System.out.println(text);
//	}
	
	//Run button
	@AndroidFindBy(id="io.appium.android.apis:id/startButton")
	public WebElement ACloningButton;
}
