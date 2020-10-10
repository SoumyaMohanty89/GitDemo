package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import utility.Constant;

public class ScrollToElement {
 
 
 public static WebDriver driver;

 public static void main(String[] args) throws Exception {
  // TODO Auto-generated method stub
  // Initialize WebDriver

	 System.setProperty("webdriver.chrome.driver", Constant.driverPath+"\\chromedriver.exe");
     driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  // Wait For Page To Load

  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

  // Go to URL

  driver.get("http://erail.in/");

  // Maximize Window
  driver.manage().window().maximize();
  
  // Enter Station From Code
  driver.findElement(By.id("txtStationFrom")).clear();
  driver.findElement(By.id("txtStationFrom")).sendKeys("MS" + Keys.TAB);
  
  // Enter Station To Code
  driver.findElement(By.id("txtStationTo")).clear();
  driver.findElement(By.id("txtStationTo")).sendKeys("TPJ" + Keys.TAB);
  
  Thread.sleep(5000L);
  try{
  // Assign Object for Last Train
  WebElement lastTrain = driver.findElement(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr[31]/td[2]/a"));
  
  // Scroll to Last Train
  
  Locatable lc = (Locatable)lastTrain;
  
 Coordinates coordinate = lc.getCoordinates();
  
  coordinate.inViewPort();
  }
  
  catch(Exception e){
	  System.out.println(e.getMessage());
  }
  
  Thread.sleep(5000L);
  
  // Close Driver
  driver.quit();
  
 }

}