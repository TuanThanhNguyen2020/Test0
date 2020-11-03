package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_AnimationPage {
	public Home_AnimationPage(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//*[@text='Bouncing Balls']")
	public WebElement Bouncing_Balls;
	
	@AndroidFindBy(xpath="//*[@text='Cloning']")
	public WebElement Cloning;
	
	@AndroidFindBy(xpath="//*[@text='Custom Evaluator']")
	public WebElement Custom_Evaluator;
	
	@AndroidFindBy(xpath="//*[@text='Default Layout Animations']")
	public WebElement Default_Layout_Animations;
	
	@AndroidFindBy(xpath="//*[@text='Events']")
	public WebElement Events;
	
	@AndroidFindBy(xpath="//*[@text='Hide-Show Animations']")
	public WebElement Hide_Show_Animations;
	
	@AndroidFindBy(xpath="//*[@text='Layout Animations']")
	public WebElement Layout_Animations;
	
	@AndroidFindBy(xpath="//*@text='Loading']")
	public WebElement Loading;
	
	@AndroidFindBy(xpath="//*[@text='Multiple Properties']")
	public WebElement Multiple_Properties;
	
	@AndroidFindBy(xpath="//*[@text='Reversing']")
	public WebElement Reversing;
	
	@AndroidFindBy(xpath="//*[@text='Seeking']")
	public WebElement Seeking;
	
	@AndroidFindBy(xpath="//*[@text='View Flip']")
	public WebElement View_Flip;
}
