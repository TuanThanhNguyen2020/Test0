package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_DefaultLayoutAnimations {
	public Home_Animation_DefaultLayoutAnimations(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement DLATitle;
	
	@AndroidFindBy(id="io.appium.android.apis:id/addNewButton")
	private WebElement DLAaddButton;
	public void DLAclick3Times(){
		for(int i = 0; i < 3; i++ ){
			DLAaddButton.click();
		}
	}
	public void DLAclick2Times(){
		for(int i = 0; i < 2; i++ ){
			DLAaddButton.click();
		}
	}
	
	
	
}
