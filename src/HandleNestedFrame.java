import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleNestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/nestedframes");

        System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());
        
        
	}

}
