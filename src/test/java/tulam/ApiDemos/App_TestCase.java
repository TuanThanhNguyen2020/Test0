package tulam.ApiDemos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class App_TestCase extends base{
	
	String appName = "ApiDemos-debug.apk";
	
	@Test
	public void actionBarTabs() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		HomePage homePage = new HomePage(driver);
		homePage.App.click();
		
		Home_App home_App = new Home_App(driver);
		home_App.ActionBar.click();
		
		Home_App_ActionBar home_App_ActionBar = new Home_App_ActionBar(driver);
		home_App_ActionBar.ActionBarTabs.click();
		
		Home_App_ActionBar_ActionBarTaps home_App_ActionBar_ActionBarTaps = new Home_App_ActionBar_ActionBarTaps(driver);
		home_App_ActionBar_ActionBarTaps.ABTTitle.getText();
		home_App_ActionBar_ActionBarTaps.AddNewTab10Times();
		home_App_ActionBar_ActionBarTaps.clickToggleTabMode();
		home_App_ActionBar_ActionBarTaps.countTabs();
		
		
		
	}
	

}
