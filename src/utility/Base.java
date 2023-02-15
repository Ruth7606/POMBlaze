package utility;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.testng.annotations.Parameters;



public class Base {
	public static final Logger log = LogManager.getLogger(Base.class);
	public WebDriver driver;
	
		
	 @BeforeTest  //BeforeTest
	 @Parameters("browser")	
	
		
		public void setUp(String browser){
		 if(browser.equalsIgnoreCase("Edge")) {
			 log.info("opening edge browser");
			File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\edgedriver_win64\\msedgedriver.exe");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			
			driver = new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("Chrome")) {
			 log.info("opening chrome browser");
			 File file =new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				
				driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("Firefox")) {
			 log.info("opening firefox browser");
			 File file = new File("C:\\Users\\User\\eclipse-workspace\\Project2\\jar\\geckodriver-v0.32.0-win-aarch64.exe");
				System.getProperty("webdriver.gecko.driver", file.getAbsolutePath());
				driver = new FirefoxDriver();
		 }
		 else {
			 //you can also use system out print
			 Reporter.log("Invalid browser");
			 log.info("invalid browser");
			 System.out.println("Invalid Browser Type");
		 }
			
			driver.manage().window().maximize();
			driver.get("https://blazedemo.com/index.php");
			 log.info("opening url");
			
	     }    
	 
	 @AfterTest
		public void afterTest(){
		 log.info("closing the browser");
			//driver.close();
		}

}
