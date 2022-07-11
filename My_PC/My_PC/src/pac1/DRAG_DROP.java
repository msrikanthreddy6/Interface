package pac1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAG_DROP {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes-demo2.html");
		driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//*[text()='Student F']")); //source
		WebElement des = driver.findElement(By.xpath("//*[@id='box1']")); //destination
		Thread.sleep(3000);
		act.clickAndHold(src).build().perform();	//For each action we need to build and Perform	
		act.moveToElement(des).build().perform();
		Thread.sleep(3000);
		act.release(des).build().perform();
		driver.close();
	}
	
}
