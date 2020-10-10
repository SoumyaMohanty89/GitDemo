package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.Constant;

public class MouseOver {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", Constant.driverPath+"\\chromedriver.exe");
     driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // Launch Application
	 
	 driver.get("http://toolsqa.com/");
	 
	 Actions action = new Actions(driver);
	 WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Tutorial')])[1]"));
	 action.moveToElement(element).perform();
	 Thread.sleep(3000);
	 WebElement element1 = driver.findElement(By.xpath("(//span[contains(text(),'ISTQB')])[1]"));
	 
	 element1.click();
	 
	 System.out.println(driver.getTitle());
	 
	 driver.close();
	}

}
