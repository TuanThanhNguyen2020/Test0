package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_LayoutAnimation {
	public Home_Animation_LayoutAnimation(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=0]")
	private WebElement layoutanimation;
	public void getLayoutAnimationTitle(){
		System.out.println(layoutanimation.getText());
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/addNewButton")
	public WebElement addButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/customAnimCB")
	public WebElement CustomAnimation;
	
	@AndroidFindBy(id="io.appium.android.apis:id/appearingCB")
	public WebElement In;
	
	@AndroidFindBy(id="io.appium.android.apis:id/disappearingCB")
	public WebElement Out;
	
	@AndroidFindBy(id="io.appium.android.apis:id/changingAppearingCB")
	public WebElement ChangingIn;
	
	@AndroidFindBy(id="io.appium.android.apis:id/changingDisappearingCB")
	public WebElement ChangingOut;
	
	public void nonchoice(){
		for(int i = 0; i < 10; i++){
			addButton.click();
		}
	}

}
