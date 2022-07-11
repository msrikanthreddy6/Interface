package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_login {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String etitle="Facebook – log in or sign up";
		String atitle=driver.getTitle();
		
		
		if(etitle.equals(atitle))
		{
			System.out.println(driver.getTitle());
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("9502942103");
			driver.findElement(By.name("pass")).sendKeys("Srikanth$234");
			driver.findElement(By.name("login")).click();
			
	
		
		}
		else
		{
		System.out.println("Invalid Application");
		driver.close();
		
		
		}
			
	}

}
