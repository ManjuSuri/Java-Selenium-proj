import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://chercher.tech/practice/implicit-wait-example");
	    FluentWait wait=new FluentWait(driver);
	    wait.withTimeout(Duration.ofSeconds(20));
	    wait.pollingEvery(Duration.ofMillis(220));
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='q']/input[1]")));
	    driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();
	    
	    
	}

}
