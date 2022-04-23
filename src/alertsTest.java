import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class alertsTest {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions opt = new ChromeOptions();
		//opt.setExperimentalOption("excludeSwithches", Arrays.asList("disable-popup-blocking"));
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
//	    driver=new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito"); //
		 * options.setExperimentalOption("excludeSwithches",
		 * Arrays.asList("disable-popup-blocking")); DesiredCapabilities capabilities =
		 * new DesiredCapabilities();
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 * options.merge(capabilities);
		 */
		/*
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\Disha\\Desktop\\selenium\\extension_4_44_0_0.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(capabilities);
		driver=new ChromeDriver(options);
		*/
		driver=new ChromeDriver();
	    
	    driver.get("https://demoqa.com/alerts");
	  //  driver.manage().window().setSize(new Dimension(400,1024));
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	   // Thread.sleep(5000);
	   // driver.
	    driver.findElement(By.id("confirmButton")).click();
	    driver.switchTo().alert().accept();
	    
//	    driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//	    Alert alert=driver.switchTo().alert();
//	    alert.accept();
	    
	}

}
