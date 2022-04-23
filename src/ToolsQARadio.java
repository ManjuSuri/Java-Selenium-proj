import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToolsQARadio {
  //static WebDriver driver;
  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Disha\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://demoqa.com/radio-button");
		WebElement radioButtonYes=driver.findElement(By.name("like"));
		System.out.println(radioButtonYes.isSelected());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		System.out.println(radioButtonYes.isSelected());
		System.out.println(radioButtonYes.isEnabled());
		WebElement radioButtonImpressive=driver.findElement(By.id("impressiveRadio"));
	//	radioButtonImpressive.
		System.out.println("before"+radioButtonImpressive.isSelected());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
		System.out.println("after"+radioButtonImpressive.isSelected());
		Thread.sleep(1000);
		driver.get("https://demoqa.com/text-box");
		driver.navigate().forward();
		WebElement name=driver.findElement(By.id("userName"));
		System.out.println(name.isDisplayed());
		WebElement textName=driver.findElement(By.xpath("//*[@id=\"userName-label\"]"));
		System.out.println(textName.getText());
		name.sendKeys("MAnju");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("MAnju@gmail.com");
		WebElement Adress=driver.findElement(By.id("currentAddress"));
		Adress.sendKeys("twin oaks ct,monmouth junction");
		WebElement Adress1=driver.findElement(By.id("permanentAddress"));
		Adress1.sendKeys("twin oaks ct,monmouth junction.com");
		Thread.sleep(1000);
		driver.get("https://demoqa.com/checkbox");
		driver.navigate().forward();
		WebElement Checkbox=driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
		System.out.println(Checkbox.isEnabled());
		driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg")).click();
		WebElement Toggle=driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg")).click();
		Thread.sleep(1000);
		driver.get("https://demoqa.com/webtables");
		driver.navigate().forward();
		WebElement add=driver.findElement(By.id("addNewRecordButton"));
		driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
		Thread.sleep(1000);
		WebElement name1=driver.findElement(By.id("firstName"));
		name1.sendKeys("Disha");
		WebElement Lname=driver.findElement(By.id("lastName"));
		Lname.sendKeys("Nivisha");
		WebElement email1=driver.findElement(By.id("userEmail"));
		email1.sendKeys("suresh@gmail.com");
		WebElement age=driver.findElement(By.id("age"));
		age.sendKeys("30");
		Thread.sleep(1000);
		WebElement salary=driver.findElement(By.id("salary"));
		salary.sendKeys("1000");
		WebElement department=driver.findElement(By.id("department"));
		department.sendKeys("comp sci");
	   WebElement submitButton=driver.findElement(By.id("submit"));
	   System.out.println(submitButton.isEnabled());
	   System.out.println(submitButton.getAttribute("type"));
	   //System.out.println(submitButton.getAttribute("value"));
	   System.out.println(submitButton.getTagName());
	    System.out.println(submitButton.getCssValue("font-size"));
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).submit();
	    driver.get("https://demoqa.com/select-menu");
		driver.navigate().forward();
		driver.manage().window().maximize();
		WebElement list=driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(list);
		select.selectByIndex(3);
		
		//driver.findElement(By.id("submit")).click();
		//System.out.println(submitButton.getAttribute("value"));
	}

}
