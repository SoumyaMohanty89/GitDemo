package testcases;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;

	public class E2ETest {

		public static WebDriver driver;
		public static void main(String args[]) throws Exception{
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader);
			System.out.println("Enter the browser type :");
			String browserType = br.readLine();
			if(browserType.equalsIgnoreCase("ff")){
				//System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Workspace\\Selenium_Training\\drivers\\geckodriver.exe");
				System.setProperty("webdriver.gecko.driver", Constant.driverPath+"\\geckodriver.exe");
				driver = new FirefoxDriver();
				//driver.manage().window().maximize();
			}else if(browserType.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", Constant.driverPath+"\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				/*ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.setExperimentalOption("useAutomationExtension", false);
				driver = new ChromeDriver(options);*/
			}else if(browserType.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", Constant.driverPath+"\\IEDriverServer.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				driver = new InternetExplorerDriver(capabilities);
				driver.manage().window().maximize();
			}
			
			String expPageTitle = "Welcome: Mercury Tours";
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Launch Application
			
			driver.get(Constant.URL);
			
			// Verify Title
			
			String actPageTitle = driver.getTitle();
			
			if(!expPageTitle.equals(actPageTitle)){
				System.out.println("Status -- Failed | expPageTitle : "+expPageTitle+" | actPageTitle : "+actPageTitle);
			}else{
				System.out.println("Status -- Passed | expPageTitle : "+expPageTitle+" | actPageTitle : "+actPageTitle);
			}
			
			
			// Login to Flight Reservation Application
			highlightElement(driver.findElement(By.xpath("//input[@name='userName'][@type='text']")));
			driver.findElement(By.xpath("//input[@name='userName'][@type='text']")).sendKeys("mercury");
			
			highlightElement(driver.findElement(By.xpath("//input[@name='password'][@type='password']")));
			driver.findElement(By.xpath("//input[@name='password'][@type='password']")).sendKeys("mercury");
			
			highlightElement(driver.findElement(By.name("login")));
			driver.findElement(By.name("login")).click();
			
			//Book A ticket
			highlightElement(driver.findElement(By.xpath("//input[@name='tripType'][@value='oneway']")));
			driver.findElement(By.xpath("//input[@name='tripType'][@value='oneway']")).click();
			
			
			// Select Departure From
			highlightElement(driver.findElement(By.name("fromPort")));
			Select dapartFrom = new Select(driver.findElement(By.name("fromPort")));
			dapartFrom.selectByVisibleText("London");
			
			// Select Arrival To
			highlightElement(driver.findElement(By.name("toPort")));
			Select arrivalTo = new Select(driver.findElement(By.name("toPort")));
			arrivalTo.selectByVisibleText("Paris");
			
			highlightElement(driver.findElement(By.xpath("//input[@name='servClass'][@value='First']")));
			driver.findElement(By.xpath("//input[@name='servClass'][@value='First']")).click();
			
			
			// Select AAirline Preference
			highlightElement(driver.findElement(By.name("airline")));
			Select airLine = new Select(driver.findElement(By.name("airline")));
			airLine.selectByVisibleText("Blue Skies Airlines");
			
			highlightElement(driver.findElement(By.name("findFlights")));
			driver.findElement(By.name("findFlights")).click();
			
			highlightElement(driver.findElement(By.name("reserveFlights")));
			driver.findElement(By.name("reserveFlights")).click();
			
			highlightElement(driver.findElement(By.name("passFirst0")));
			driver.findElement(By.name("passFirst0")).sendKeys("Soumya");
			highlightElement(driver.findElement(By.name("passLast0")));
			driver.findElement(By.name("passLast0")).sendKeys("Mohanty");
			highlightElement(driver.findElement(By.name("creditnumber")));
			driver.findElement(By.name("creditnumber")).sendKeys("87654565");
			highlightElement(driver.findElement(By.name("buyFlights")));
			driver.findElement(By.name("buyFlights")).click();
			
			//Verify Text Present on the screen
			if(driver.getPageSource().contains("itinerary has been booked!")){
				System.out.println("Status -- Passed | Ticket has been booked successfully");
				}else{
					System.out.println("Status -- Failed | Ticket has not been booked successfully");
				}
			driver.close();
		}
		
		
		
		public static void highlightElement(WebElement element){
			  
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",element);
			 }

	}



