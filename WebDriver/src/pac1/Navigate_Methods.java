package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		try {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

			String etitle = "Facebook – log in or sign up";
			String atitle = driver.getTitle();

			if (etitle.equals(atitle)) {
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.id("//input[@id='email']")).sendKeys("9502942103");
				Thread.sleep(3000);
				driver.findElement(By.id("//input[@id='pass']")).sendKeys("Srikanth$234");
				Thread.sleep(3000);
				// driver.findElement(By.id("//button[@id='u_0_5_ww']")).click();
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
			} else {
				System.out.println("Invalid Application");
				driver.close();
			}

		} catch (Exception e) {
			driver.quit();
		}
	}

}
