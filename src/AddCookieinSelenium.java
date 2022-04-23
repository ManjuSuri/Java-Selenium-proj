import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddCookieinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Disha\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/droppable");
	    driver.manage().window().maximize();
	    Set<Cookie> allCookie= driver.manage().getCookies();
	    System.out.println(allCookie.size());
	    for(Cookie eachCookie:allCookie) {
	    	System.out.println(eachCookie.getName()+";"+eachCookie.getValue());
	    }
	    System.out.println("--------after add 1 cookie--------");
	    Cookie newAddCookie=new Cookie("MyNewCookie","1446875");//adding 1 cookie
	    driver.manage().addCookie(newAddCookie);//adding cookie
	    Set<Cookie> allCookie1= driver.manage().getCookies();
	    
	    
	    System.out.println(allCookie1.size());
	    for(Cookie eachCookie:allCookie1) {
	    	System.out.println(eachCookie.getName()+";"+eachCookie.getValue());//geting name and value of all cookie
	    	
	    	
	    	System.out.println("------------GetNamedCookie--------");
	    	Cookie namedCookie=driver.manage().getCookieNamed("_gid");
	    	System.out.println(namedCookie.getName()+";"+namedCookie.getValue());
	    	
	    }  
	    
	}

}
