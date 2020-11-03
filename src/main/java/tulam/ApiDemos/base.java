package tulam.ApiDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {

	public static AndroidDriver<AndroidElement> driver; 
	
//	public static void startEmulator() throws IOException, InterruptedException{
//		//C:\Users\84163\workspace\AppiumFramework\src\main\java\resources\startEmulator.bat
//		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator.bat");
//		Thread.sleep(6000);
//	}
	public static AndroidDriver<AndroidElement> Capabilities(String appName)throws IOException, InterruptedException{
//		FileInputStream fis = FileInputStream(System.getProperty("user.dir"+"\\src\\main\\java\\tulam\\ApiDemos\\global.properties"));
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.get(appName);
		
		AndroidDriver<AndroidElement> driver;
		
		
		File appDir = new File("src");
		File app = new File(appDir,"ApiDemos-debug.apk");
//		File app = new File(appDir,(String)prop.get(appName));
		DesiredCapabilities cap = new DesiredCapabilities();
//		String device = (String)prop.get("device");
//		if(device.contains("emulator")){
//			startEmulator();
//		}
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 24");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

	


}
