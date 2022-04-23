import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeDeleteRecords {
    static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demoqa.com/webtables");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//div[text()='kierra@example.com']/following-sibling::div/div/span[@title='Delete']")).click();;
		
		deleteUser("alden@example.com");
		deleteUser("cierra@example.com");
		deleteUser("kierra@example.com");
	}
	 static void deleteUser(String UserEmail) {
		 
	 WebElement deleteAction=driver.findElement(By.xpath("//div[text()='"+UserEmail+"' ]/following-sibling::div/div/span[@title='Delete']"));
	 deleteAction.click();
	}
	 }

