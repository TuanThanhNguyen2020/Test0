package tulam.ApiDemos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

public class Animation_Testcase extends base{
	String appName = "ApiDemos-debug.apk";
	
	@Test(enabled=false)
	public void bouncingballs() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debug.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Bouncing_Balls.click();
		
		Home_Animation_BouncingBalls home_Animation_BouncingBalls = new Home_Animation_BouncingBalls(driver);
		home_Animation_BouncingBalls.longPressBBView();
	}
	
	@Test(enabled=false)
	public void cloning() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debugs.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click Animation
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		//Click Cloning
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Cloning.click();
		//get title
		Home_Animation_Cloning home_Animation_Cloning = new Home_Animation_Cloning(driver);
		System.out.println(home_Animation_Cloning.ACloningTitle.getText());
		//click run button
		home_Animation_Cloning.ACloningButton.click();
	}
	
	@Test(enabled = false)
	public void customevaluator() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debugs.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Custom_Evaluator.click();
		
		Home_Animation_CustomEvaluator home_Animation_CustomEvaluator = new Home_Animation_CustomEvaluator(driver);
		System.out.println(home_Animation_CustomEvaluator.CETitle.getText());
		
		home_Animation_CustomEvaluator.playbutton.click();
		
	}
	
	@Test(enabled=false)
	public void defaultLayoutAnimations() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Default_Layout_Animations.click();
		
		Home_Animation_DefaultLayoutAnimations home_Animation_DefaultLayoutAnimations 
		= new Home_Animation_DefaultLayoutAnimations(driver);
		
		String DLATitle = home_Animation_DefaultLayoutAnimations.DLATitle.getText();
		System.out.println(DLATitle);
		
		home_Animation_DefaultLayoutAnimations.DLAclick2Times();
		driver.navigate().back();
	}
	
	@Test(enabled= false)
	public void Events() throws InterruptedException, IOException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Events.click();
		
		Home_Animation_Events home_Animation_Events = new Home_Animation_Events(driver);
		home_Animation_Events.StarButton.click();
		Thread.sleep(5000);
		home_Animation_Events.StarButton.click();
		Thread.sleep(500);
		home_Animation_Events.EndButton.click();
		Thread.sleep(2000);
		home_Animation_Events.StarButton.click();
		Thread.sleep(500);
		home_Animation_Events.EndImButton.click();
		Thread.sleep(2000);
		home_Animation_Events.StarButton.click();
		Thread.sleep(500);
		home_Animation_Events.CancelButton.click();
		
		System.out.println(home_Animation_Events.EventsTitle.getText());
	}
	@Test(enabled=false)
	public void HideShowAnimation() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Hide_Show_Animations.click();
		
		Home_Animation_HideShowAnimations home_Animation_HideShowAnimations = new Home_Animation_HideShowAnimations(driver);
		home_Animation_HideShowAnimations.HSTitle.getText();
		
		home_Animation_HideShowAnimations.nonchoice();
		Thread.sleep(3000);
		home_Animation_HideShowAnimations.ShowButton.click();
		home_Animation_HideShowAnimations.custom();
		home_Animation_HideShowAnimations.ShowButton.click();
		Thread.sleep(3000);
		home_Animation_HideShowAnimations.CustomAnimation.click();
		home_Animation_HideShowAnimations.hidegone();
		Thread.sleep(3000);
		home_Animation_HideShowAnimations.ShowButton.click();
		home_Animation_HideShowAnimations.custom();
		
	}
	
	@Test(enabled = false)
	public void layoutAnimation() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Layout_Animations.click();
		
		Home_Animation_LayoutAnimation home_Animation_LayoutAnimation = new Home_Animation_LayoutAnimation(driver);
		home_Animation_LayoutAnimation.nonchoice();
	}
	
	@Test(enabled=false)
	public void loading() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Loading.click();
		
		Home_Animation_Loading home_Animation_Loading = new Home_Animation_Loading(driver);
		home_Animation_Loading.getLoadingTitle();
		
		home_Animation_Loading.LoadingRunButton.click();
		
	}
	
	@Test(enabled = false)
	public void multipleproperties() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Multiple_Properties.click();
		
		Home_Animation_MultipleProperties home_Animation_MultipleProperties = new Home_Animation_MultipleProperties(driver);
		
		home_Animation_MultipleProperties.getLoadingTitle();
		
		home_Animation_MultipleProperties.MPRunButton.click();
		
	}
	
	@Test(enabled= false)
	public void reversing() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Reversing.click();
		
		Home_Animation_Reversing home_Animation_Reversing = new Home_Animation_Reversing(driver);
		
		home_Animation_Reversing.getReversingTitle();
		
		home_Animation_Reversing.PlayButton.click();
		Thread.sleep(500);
		home_Animation_Reversing.ReverseButton.click();
		
	}
	
	@Test(enabled = false)
	public void seekbar() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.Seeking.click();
		
		Home_Animation_Seeking home_Animation_Seeking = new Home_Animation_Seeking(driver);
		//action.longpress
		TouchAction action = new TouchAction((MobileDriver)driver);
		action.longPress(ElementOption.element(home_Animation_Seeking.seekBar)).moveTo(ElementOption.element(home_Animation_Seeking.seekBar,500,500)).release().perform();
		
	
	}
	
	@Test(enabled=false)
	public void viewflip() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities(appName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		homePage.Animation.click();
		
		Home_AnimationPage home_AnimationPage = new Home_AnimationPage(driver);
		home_AnimationPage.View_Flip.click();
		
		Home_Animation_ViewFlip home_Animation_ViewFlip = new Home_Animation_ViewFlip(driver);
		
		home_Animation_ViewFlip.getViewFlipTitle();
		
		//Get Enlish List
		home_Animation_ViewFlip.getTextOne();
		home_Animation_ViewFlip.getTextTwo();
		home_Animation_ViewFlip.getTextThree();
		home_Animation_ViewFlip.getTextFour();
		home_Animation_ViewFlip.getTextFive();
		home_Animation_ViewFlip.getTextSix();
		
		home_Animation_ViewFlip.FlipButton.click();
		//Get French List
		home_Animation_ViewFlip.getTextOne();
		home_Animation_ViewFlip.getTextTwo();
		home_Animation_ViewFlip.getTextThree();
		home_Animation_ViewFlip.getTextFour();
		home_Animation_ViewFlip.getTextFive();
		home_Animation_ViewFlip.getTextSix();
	}
	
	
	
	
}
