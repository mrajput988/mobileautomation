package mobile_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class androidapp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		ds.setCapability(MobileCapabilityType.APP,"D:\\Releases\\Android_1.12.35\\Android_MC_1.12.35.apk");
		ds.setCapability("appPackage","com.agnity.aconyx.mc");
		ds.setCapability("appActivity","com.agnity.aconyx.mc.view.ActivitySplash");
		
		
        URL url = new URL("http://localhost:4723/wd/hub/");
		
	
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, ds);
				
		
		Thread.sleep(5000);
		
		
	 //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("agnitytest.com");   // Domain register
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.agnity.aconyx.mc:id/configureBtn")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("com.agnity.aconyx.mc:id/user_id_value")).sendKeys("mg");     // enter username
		Thread.sleep(2000);
		driver.findElement(By.id("com.agnity.aconyx.mc:id/user_password_value")).sendKeys("1111");     //  enter password
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.Button")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.id("com.agnity.aconyx.mc:id/btn_confirm")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		
		Thread.sleep(5000);
	//   WebDriverWait ws = new WebDriverWait(driver,20);
		
     	//WebDriverWait ws =new WebDriverWait(driver, Duration.ofSeconds(10));
	// ws.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@index='1']"))).click();
		
		
//	MobileElement con=	driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']"));
//	ws.until(ExpectedConditions.elementToBeClickable(con));
	//ws.until(ExpectedConditions.elementToBeClickable(con));
//	con.click();
		
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/action_search")).click();
		   Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/search_src_text")).sendKeys("manoj");
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/contact_row_parent_layout")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/contact_message")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/message_box")).sendKeys("Hello");
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/btn_send")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/layout_menu_item_template")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("android.widget.CheckedTextView")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/btn_send")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/layout_back")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/title_left_view")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("android.widget.ImageButton")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.className("android.widget.ImageButton")).click();
			Thread.sleep(3000);
			ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
			driver.findElement(By.id("com.agnity.aconyx.mc:id/group_message_fab")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("android.widget.ImageButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("android.widget.ImageButton")).click();
			Thread.sleep(3000);
			ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			
			
		//	Thread.sleep(10000);
			
			//driver.quit();
	
	}
			
}
