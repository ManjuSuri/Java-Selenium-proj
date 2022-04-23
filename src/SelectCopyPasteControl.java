
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectCopyPasteControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/text-box");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)", "");
	    driver.findElement(By.id("userName")).sendKeys("Manju");
	    driver.findElement(By.id("userEmail")).sendKeys("manju@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("4406 twin oaks address");
        Actions action=new Actions(driver);
        action.keyDown(Keys.CONTROL);
        action.sendKeys("a");
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL);
        action.sendKeys(Keys.TAB);
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).submit();
        Thread.sleep(6000);
	}

}
