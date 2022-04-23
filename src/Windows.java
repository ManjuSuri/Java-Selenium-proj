import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/browser-windows");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
	    driver.findElement(By.id("tabButton")).click();
	    String mainWindow=driver.getWindowHandle();
	    Set<String> AllOpenWindow=driver.getWindowHandles();
	    System.out.println(AllOpenWindow.size());
	    AllOpenWindow.remove(mainWindow);
	    System.out.println(AllOpenWindow.size());
	    
	    for(String eachWindow:AllOpenWindow) {
	    	driver.switchTo().window(eachWindow);
	    System.out.println(driver.findElement(By.xpath("//h1")).getText());
	   // driver.close();
	    	
	    }
	    driver.switchTo().window(mainWindow);
	    driver.findElement(By.id("windowButton")).click();
	   for(String newWindow:AllOpenWindow) {
	    	driver.switchTo().window(newWindow);
	     System.out.println(driver.findElement(By.xpath("//h1")).getText());
	    // driver.close();
	   }
    driver.switchTo().window(mainWindow);
    driver.findElement(By.id("messageWindowButton")).click();
    for(String newWindowMsg:AllOpenWindow) {
	    	driver.switchTo().window(newWindowMsg);
	     System.out.println("body "+driver.findElement(By.partialLinkText("but not by saving.")).getText());
	     driver.close();
	    }
	}//3rd window not taking text from the pop up window

}
