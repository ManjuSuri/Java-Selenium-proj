import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 WebElement resetPasswordLink=driver.findElement(By.partialLinkText("Forgot your"));
		 resetPasswordLink.click();
//		 WebElement userName=driver.findElement(By.cssSelector("#txtUsername"));
//		 userName.sendKeys("MAnju");
//		 WebElement userId=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
//		 userId.sendKeys("MAnju");
	//	 WebElement user=driver.findElement(By.name("FirstName"));
	//	 userName.sendKeys("MAnju");
	}

}
