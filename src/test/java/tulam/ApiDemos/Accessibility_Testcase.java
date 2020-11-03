package tulam.ApiDemos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
@Test
public class Accessibility_Testcase extends base{
	public void accessibility() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debug.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Declare Home_AccessibilityPage
		HomePage homePage = new HomePage(driver);
		Home_AccessibilityPage home_AccessibilityPage = new Home_AccessibilityPage(driver);
		Home_Accessibility_AccessibilityNodeQuerying home_Accessibility_AccessibilityNodeQuerying = new Home_Accessibility_AccessibilityNodeQuerying(driver);
		
		homePage.getAccessibility().click();
		home_AccessibilityPage.Accessibility_Node_Querying.click();
		
		//Compare and print title
		String expectedTitleANQ = "Accessibility/Accessibility Node Querying";
		String actualTitleANQ = home_Accessibility_AccessibilityNodeQuerying.Title_AccessibilityNodeQuerying.getText();
		Assert.assertEquals(actualTitleANQ, expectedTitleANQ);
		System.out.println("Tieu de that su la: "+actualTitleANQ+"\nTieu de mong muon la:"+expectedTitleANQ);
		
		//Get quick intro text
		String ANQquickintro = home_Accessibility_AccessibilityNodeQuerying.ANQ_QuickIntroduction.getText();
		System.out.println(ANQquickintro);
		
		//Click checkbox take out trash
		home_Accessibility_AccessibilityNodeQuerying.checkbox_TakeoutTrash.click();
		
		//Click checkbox do Laundry
		home_Accessibility_AccessibilityNodeQuerying.checkbox_DoLaundry.click();
		
		//Click checkbox ConquerWorld
		home_Accessibility_AccessibilityNodeQuerying.checkbox_ConquerWorld.click();
		
		//Click checkbox Nap
		home_Accessibility_AccessibilityNodeQuerying.checkbox_Nap.click();
				
		//Click checkbox DoTaxes
		home_Accessibility_AccessibilityNodeQuerying.checkbox_DoTaxes.click();
				
		//Click checkbox AbolishIRS
		home_Accessibility_AccessibilityNodeQuerying.checkbox_AbolishIRS.click();

		//Click checkbox TeawithAuntSharon
		home_Accessibility_AccessibilityNodeQuerying.checkbox_TeawithAuntSharon.click();
		
		driver.navigate().back();
		
		//Declare Accessibility Node Provider
		Home_Accessibility_AccessibilityNodeProvider home_Accessibility_AccessibilityNodeProvider
		= new Home_Accessibility_AccessibilityNodeProvider(driver);
		//Click on Accessibility Node Provider
		home_AccessibilityPage.Accessibility_Node_Provider.click();
		//Compare Title
		String ANPactualTitle = home_Accessibility_AccessibilityNodeProvider.ANPTitle.getText();
		String ANPexpectedTitle = "Accessibility/Accessibility Node Provider";
		Assert.assertEquals(ANPactualTitle,ANPexpectedTitle);
//		if(ANPactualTitle != ANPexpectedTitle){
//			System.out.println("Tieu de khac nhau:\n"+ ANPactualTitle +"\n"+ANPexpectedTitle);
//		}else{
//			
//			System.out.println("Tieu de giong nhau: "+ ANPactualTitle);
//		}
//		System.out.println("Tieu de mong muon la:"+ ANPexpectedTitle);
//		System.out.println("Tieu de thuc su la:"+ ANPactualTitle);
		
		
		//Print quick introduction.
		String ANPquickIntroduction = home_Accessibility_AccessibilityNodeProvider.ANPQuickIntro.getText();
		System.out.println(ANPquickIntroduction);
		
		driver.navigate().back();
		
		
		//Accessibility Service.
		home_AccessibilityPage.Accessibility_Service.click();
		Home_Accessibility_AccessibilityService home_Accessibility_AccessibilityService
		= new Home_Accessibility_AccessibilityService(driver);
		
		
		String accessibilityservice = home_Accessibility_AccessibilityService.AccessibilityService.getText();
		System.out.println(accessibilityservice);
		
		
		//Click on Custom View
		driver.navigate().back();
		home_AccessibilityPage.Custom_View.click();
		
		
	}

}
