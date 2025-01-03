package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepLogin {
	public static WebDriver driver;
	public static Loginpage lp;
	  

		@Given("user is on login page")
		public void user_is_on_login_page() {
			/*
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Noor Mohamed A\\eclipse_workspace\\BookwaterAdmin\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new Loginpage(driver);
		driver.navigate().to("https://loginstage.bookwater.com/authenticate");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();*/
			String userDirectory = System.getProperty("user.home");
		    
		    // Detect OS to set the correct ChromeDriver path
		    String chromeDriverPath;
		    System.out.println(System.getProperty("os.name").toLowerCase());
		    if (System.getProperty("os.name").toLowerCase().contains("win")) {
		        // Windows path
		        chromeDriverPath = userDirectory + "\\chromedriver.exe";
		    } else {
		        // Linux path (ensure the correct path where chromedriver is located)
		        chromeDriverPath = "/usr/bin/chromedriver";
		    }
		    
		    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	 
		    // Set up ChromeOptions
		    ChromeOptions options = new ChromeOptions();
		    if (!System.getProperty("os.name").toLowerCase().contains("win")) {
		        // Add headless mode for Linux
		        options.addArguments("--headless");  // Run in headless mode
		        options.addArguments("--no-sandbox");  // Required for running Chrome in containers
		        options.addArguments("--disable-dev-shm-usage");  // Overcome limited resource issues
		        options.addArguments("--disable-gpu");  // Disable GPU (optional, may be needed in headless mode)
		    }
	 
		    this.driver = new ChromeDriver(options);  // Pass ChromeOptions to ChromeDriver
		    lp = new Loginpage(driver);
		    
		    driver.get("https://loginstage.bookwater.com/authenticate");
		    
		    // Maximize current window
		    driver.manage().window().maximize();
			
			
			
		}

		@When("user enters username and password")
		public void user_enters_username_and_password() {
			lp.setUserName();
			lp.setPassword();
		}
		@When("clicks on Login button")
		public void clicks_on_login_button() {
			lp.clickLogin();
		}
		@Then("Admin Home page")
		public void admin_home_page() {
			String expResult = "Dashboard";
			String actResult = lp.homePage();
			Assert.assertEquals(actResult, expResult);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}



	
}
