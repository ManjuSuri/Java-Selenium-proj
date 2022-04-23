import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestFirst {

static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.close();
		}
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Disha\\Desktop\\selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		// driver.get("https://www.google.com/");
		else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		// driver.get("https://www.google.com/");
		 //driver.close();
	}
		driver.get("https://www.google.com/");
		driver.close();
}
}