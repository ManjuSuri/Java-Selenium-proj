import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class HandleEditRecords {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demoqa.com/webtables");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//div[text()='kierra@example.com']/following-sibling::div/div/span[@title='Delete']")).click();;
		
		editUser("alden@example.com");
//		editUser("cierra@example.com");
//		editUser("kierra@example.com");
	}
	 static void editUser(String UserEmail) {
	WebElement edit=driver.findElement(By.xpath("//*[@id='edit-record-1']")); 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", edit);
	 WebElement editAction=driver.findElement(By.xpath("//div[text()='alden@example.com']/following-sibling::div/div/span[@title='Edit']"));
	 
	 editAction.click();
	 WebElement fName=driver.findElement(By.id("firstName"));
	 fName.clear();
	 fName.sendKeys("manju");
	 driver.findElement(By.id("submit")).submit();
	}
	 
	}


