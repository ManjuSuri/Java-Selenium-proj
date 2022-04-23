import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RevertDraggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/droppable");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)", "");
	    driver.findElement(By.id("droppableExample-tab-revertable")).click();
	    Actions act=new Actions(driver);
	    act.clickAndHold(driver.findElement(By.id("notRevertable")));
	    act.moveToElement(driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-accept']")));
	    act.release();
	    act.build().perform();//Not Working
	    
	 
	    
	}

}
