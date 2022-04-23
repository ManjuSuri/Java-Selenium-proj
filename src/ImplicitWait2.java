
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 {
    static WebDriver driver;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://chercher.tech/practice/implicit-wait-example");
	    driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='q']/input[2]")).click();
	    driver.findElement(By.xpath("//div[@id='q']/input[3]")).click();
	    driver.findElement(By.xpath("//div[@id='q']/input[4]")).click();
	    
	}

}
