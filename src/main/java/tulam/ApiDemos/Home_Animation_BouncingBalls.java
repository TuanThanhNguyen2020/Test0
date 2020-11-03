package tulam.ApiDemos;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
//import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Animation_BouncingBalls {
	
	AppiumDriver<MobileElement> driver;
	public Home_Animation_BouncingBalls(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.View[@index='0']")
	private WebElement BBView;
	public void longPressBBView() throws InterruptedException{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		
		int top_y = (int)(height*0.80);
		int bottom_y = (int)(height*0.20);
		
		
		System.out.println("coordinates :"+ x + " " + top_y + " "+ bottom_y);
		
		TouchActions ts = new TouchActions(driver);
		ts.longPress(BBView).move(x, bottom_y).release().perform();
	}
	
}
