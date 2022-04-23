import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://demoqa.com/select-menu");
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
// driver.findElement(By.xpath("//div[text()='Select Option']")).click();
// driver.findElement(By.xpath("//div[text()='Group 1, option 1']")).click();
     driver.findElement(By.xpath("//div[text()='Select Title']")).click();
     driver.findElement(By.xpath("//div[text()='Other']")).click();
     driver.findElement(By.xpath("//div[text()='Select...']")).click();
   	 driver.findElement(By.xpath("//div[text()='Green']")).click();
   	driver.findElement(By.xpath("//div[text()='Blue']")).click();
   	driver.findElement(By.xpath("//div[text()='Red']")).click();
   	driver.findElement(By.xpath("//div[text()='Blue']/following-sibling::div")).click();
   	
   	
//			WebElement list1=driver.findElement(By.id("oldSelectMenu"));
//			Select select=new Select(list1);
//			WebElement selectedOption=select.getFirstSelectedOption();
//			System.out.println(selectedOption.getText());
//			WebElement selectmenu=driver.findElement(By.id("cars"));
     
//			Select select1=new Select(selectmenu);
//			select1.selectByIndex(0);
//			select1.selectByVisibleText("Saab");
//			select1.selectByValue("opel");
//			List<WebElement> everyOptions=select1.getAllSelectedOptions();
//			for(WebElement eachOptions:everyOptions) {
//				System.out.println(eachOptions.getText());
//			}
		//	select1.deselectAll();
//			select1.deselectByIndex(0);
//			select1.deselectByVisibleText("Saab");
//			select1.deselectByValue("opel");
			//select.selectByIndex(3);
			//select.selectByVisibleText("Magenta");
//			select.selectByValue("8");
//			List<WebElement> allOptions= select.getOptions();
//			for(WebElement eachOption:allOptions) {
//				System.out.println(eachOption.getText());
//			}
			
	}

}
