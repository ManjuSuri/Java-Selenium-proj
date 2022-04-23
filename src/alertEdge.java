import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertEdge {
	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/alerts");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
		
//		driver.findElement(By.cssSelector("#confirmButton")).click();
//		Alert alert=driver.switchTo().alert();
//		//  Thread.sleep(3000);
//		//alert.accept();
//		alert.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
     	Alert alert=driver.switchTo().alert();
     	Thread.sleep(3000);
     	alert.sendKeys("ScriptQA");
     	System.out.println(alert.getText());
     	alert.accept();
     	
	}

}
