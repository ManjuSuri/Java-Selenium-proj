import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassProgram {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/menu");
        JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)", "");
		 WebElement MainMenu2=driver.findElement(By.linkText("Main Item 2"));
		 Actions action=new Actions(driver);
		 action.moveToElement(MainMenu2).perform();
		 WebElement SubMenu=driver.findElement(By.linkText("SUB SUB LIST »"));
		 action.moveToElement(SubMenu).perform();
		 WebElement SubSub2Menu=driver.findElement(By.linkText("Sub Sub Item 2"));
		 action.moveToElement(SubSub2Menu).perform();
		 //action.build().perform();
		 
	}

}
