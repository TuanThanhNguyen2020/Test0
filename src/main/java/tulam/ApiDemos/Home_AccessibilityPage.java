package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_AccessibilityPage {
	
	public Home_AccessibilityPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//	Accessibility Node Provider
	@AndroidFindBy(xpath="//*[@text='Accessibility Node Provider']")
	public WebElement Accessibility_Node_Provider;
	
	//Accessibility Node Querying
	@AndroidFindBy(xpath="//*[@text='Accessibility Node Querying']")
	public WebElement Accessibility_Node_Querying;
	
	//Accessibility Service
	@AndroidFindBy(xpath="//*[@text='Accessibility Service']")
	public WebElement Accessibility_Service;
		
	//Custom View
	@AndroidFindBy(xpath="//*[@text='Custom View']")
	public WebElement Custom_View;

}
