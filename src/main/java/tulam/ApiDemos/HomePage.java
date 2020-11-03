package tulam.ApiDemos;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public HomePage(AndroidDriver<AndroidElement>driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
	//Accessibility
	@AndroidFindBy(xpath="//*[@text='Accessibility']")
	private WebElement Accessibility;
	public WebElement getAccessibility(){
		return Accessibility;
	}
	
	//Animation
	@AndroidFindBy(xpath="//*[@text='Animation']")
	public WebElement Animation;
	
	//App
	@AndroidFindBy(xpath="//*[@text='App']")
	public WebElement App;
	
	//Content
	@AndroidFindBy(xpath="//*[@text='Content']")
	public WebElement Content;
	
	//Graphics
	@AndroidFindBy(xpath="//*[@text='Graphics']")
	public WebElement Graphics;
	
	//Hardware
	@AndroidFindBy(xpath="//*[@text='Hardware']")
	public WebElement Hardware;
	
	//Media
	@AndroidFindBy(xpath="//*[@text='Media']")
	public WebElement Media;
	
	//NFC
	@AndroidFindBy(xpath="//*[@text='NFC']")
	public WebElement NFC;
	
	//OS
	@AndroidFindBy(xpath="//*[@text='OS']")
	public WebElement OS;
	
	//Preference
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Preference']")
	public WebElement Preference;
	
	//Security
	@AndroidFindBy(xpath="//*[@text='Security']")
	public WebElement Security;
	
	//Views
	@AndroidFindBy(xpath="//*[@text='Views']")
	public WebElement Views;
	
	
	
}
