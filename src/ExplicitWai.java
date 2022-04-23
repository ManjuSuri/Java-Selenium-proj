import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://chercher.tech/practice/implicit-wait-example");
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='q']/input[1]"))).click();
	    WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='q']/input[2]"))).click();
	}

}
