package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_ViewFlip {
	public Home_Animation_ViewFlip(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=0]")
	private WebElement ViewFlipTitle;
	public void getViewFlipTitle(){
		System.out.println(ViewFlipTitle.getText());
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/button")
	public WebElement FlipButton;
	
	@AndroidFindBy(xpath="(//android.widget.TextView)[2]")
	public WebElement One;
	public void getTextOne(){
		System.out.println(One.getText());
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=1]")
	public WebElement Two;
	public void getTextTwo(){
		System.out.println(Two.getText());
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@index=2]")
	public WebElement Three;
	public void getTextThree(){
		System.out.println(Three.getText());
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@index=3]")
	public WebElement Four;
	public void getTextFour(){
		System.out.println(Four.getText());
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@index=4]")
	public WebElement Five;
	public void getTextFive(){
		System.out.println(Five.getText());
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@index=5]")
	public WebElement Six;
	public void getTextSix(){
		System.out.println(Six.getText());
	}
	

}
