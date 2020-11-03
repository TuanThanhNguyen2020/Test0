package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Accessibility_AccessibilityNodeQuerying {
	public  Home_Accessibility_AccessibilityNodeQuerying(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}
	//The title of the page
	@AndroidFindBy(xpath="//*[@text='Accessibility/Accessibility Node Querying']")
	public WebElement Title_AccessibilityNodeQuerying;
	
//	Get text
//	1. Enable QueryBack (Settings -> Accessibility -> QueryBack). 
//	2. Enable Explore-by-Touch (Settings -> Accessibility -> Explore by Touch). 
//	3. Touch explore the list.
	@AndroidFindBy(xpath="(//android.widget.TextView)[2]")
	public WebElement ANQ_QuickIntroduction;
	// 
	
	//Take out Trash
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[1]")
	public WebElement checkbox_TakeoutTrash;
	
	//Do Laundry
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[2]")
	public WebElement checkbox_DoLaundry;
		
	//Conquer World
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[3]")
	public WebElement checkbox_ConquerWorld;
		
	//Nap
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[4]")
	public WebElement checkbox_Nap;
		
	//Do Taxes
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[5]")
	public WebElement checkbox_DoTaxes;
		
	//Abolish IRS
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[6]")
	public WebElement checkbox_AbolishIRS;
		
	//Tea with Aunt Sharon
	@AndroidFindBy(xpath="(//android.widget.CheckBox)[7]")
	public WebElement checkbox_TeawithAuntSharon;
	
	
	
}
