import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stuba
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/");
	    driver.navigate().to("https://www.google.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
		//driver.close();
	    //String pageTitle=driver.getTitle();
	  //  System.out.println(pageTitle);
	  //  String url=driver.getCurrentUrl();
	  //  System.out.println(url);
	  //  String pageSource=driver.getPageSource();
	   // System.out.println(pageSource);
	   // Thread.sleep(2000);
	    //driver.quit();
	}

}
