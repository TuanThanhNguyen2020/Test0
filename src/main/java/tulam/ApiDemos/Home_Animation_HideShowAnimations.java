package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_HideShowAnimations {
	public Home_Animation_HideShowAnimations(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=0]")
	public WebElement HSTitle;
	
	@AndroidFindBy(id="io.appium.android.apis:id/addNewButton")
	public WebElement ShowButton;

	@AndroidFindBy(id="io.appium.android.apis:id/customAnimCB")
	public WebElement CustomAnimation;
	
	@AndroidFindBy(id="io.appium.android.apis:id/hideGoneCB")
	public WebElement HideGone;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=0]")
	private WebElement zero;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=1]")
	private WebElement one;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=2]")
	private WebElement two;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text=3]")
	private WebElement three;
	
	public void nonchoice(){
		zero.click();
		one.click();
		two.click();
		three.click();
	}
	
	public void custom(){
		CustomAnimation.click();
		zero.click();
		one.click();
		two.click();
		three.click();
	}
	
	public void hidegone(){
		HideGone.click();
		zero.click();
		one.click();
		two.click();
		three.click();
	}
}
