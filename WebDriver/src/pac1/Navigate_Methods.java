package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		String etitle="Facebook – log in or sign up";
		String atitle=driver.getTitle();
		
		if(etitle.equals(atitle))
		{
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
		}
		else
		{
			System.out.println("Invalid Application");
			driver.close();
		}
		
		
		

	}

}
