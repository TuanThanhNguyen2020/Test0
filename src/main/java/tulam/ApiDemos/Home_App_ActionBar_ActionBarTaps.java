package tulam.ApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_App_ActionBar_ActionBarTaps {
	public Home_App_ActionBar_ActionBarTaps(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement ABTTitle;
	public void getABTTitle(){
		System.out.println(ABTTitle.getText());
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Add new tab']")
	private WebElement btnAddnewtab;
	public void AddNewTab10Times(){
		for(int i = 0; i < 10; i ++){
			btnAddnewtab.click();
		}
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Remove last tab']") 
	public WebElement btnRemovelasttab;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Toggle tab mode']")
	private WebElement Toggletabmode;
	public void clickToggleTabMode(){
		Toggletabmode.click();
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Remove all tabs']")
	public WebElement btnRemovealltabs;
	
	@AndroidFindBy(className="android.app.ActionBar$Tab")
	public WebElement Tab;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView")
	private WebElement ScrollView;
	public void countTabs(){
		int Tabs  = 10;
		int CountTabs = 
		if(Tabs == CountTabs){
			System.out.println("So tabs la:" + CountTabs);
		}else{
			System.out.println("Number Tabs:"+ScrollView.getSize());
		}
		
	}
	
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView")
	private WebElement ScrollView;
	public void countTabs(){
		int Tabs  = 10;
		int CountTabs = 
		if(Tabs == CountTabs){
			System.out.println("So tabs la:" + CountTabs);
		}else{
			System.out.println("Number Tabs:"+ScrollView.getSize());
		}
		
	}
	
	
	
	
}
