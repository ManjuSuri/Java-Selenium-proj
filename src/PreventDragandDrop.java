import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PreventDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/droppable");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)", "");
	    driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
	    WebElement source=driver.findElement(By.id("dragBox"));
	    WebElement target=driver.findElement(By.id("notGreedyInnerDropBox"));
	    Actions action=new Actions(driver);
	    action.dragAndDrop(source, target);
	    action.build().perform();
	}

}
