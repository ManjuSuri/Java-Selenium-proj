import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.easemytrip.com/");
	    driver.findElement(By.id("FromSector_show")).sendKeys("Delhi");
	    driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai");
	    driver.findElement(By.id("ddate")).sendKeys("21/04/2022");
	    driver.findElement(By.id("rdate")).sendKeys("23/04/2022");
	   //implicit wait dint work in this website
	}

}
