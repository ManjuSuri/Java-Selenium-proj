import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://www.orangehrm.com/open-source/demo/");
		 WebElement userName=driver.findElement(By.name("FirstName"));
		 userName.sendKeys("MAnju");
		WebElement userId=driver.findElement(By.id("Form_submitRequest_CompanyName"));
		System.out.println(userId.isEnabled());
		 userId.sendKeys("MAnju");
		 WebElement userLastname=driver.findElement(By.cssSelector("#Form_submitRequest_JobTitle"));
		 //System.out.println(userLastname.isDisplayed());
		 userLastname.sendKeys("MAnju");
		//	driver.close();
		}

	}
	