import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class ToolsQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://demoqa.com/text-box");
		WebElement name=driver.findElement(By.tagName("input"));
		// name.sendKeys("MAnju");
		/*
		 * List<WebElement> AllInputBox=driver.findElements(By.tagName("input"));
		 * for(WebElement ele:AllInputBox) { ele.sendKeys("Manju");
		 * 
		 * }
		 */
		 
	}

}