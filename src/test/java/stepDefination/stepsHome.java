package stepDefination;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;

import com.pages.Home;

import io.cucumber.java.AfterStep;
//import cucumber.api.java.en.And;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsHome {

	public static WebDriver driver;
	public static Home lp;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Milind Manoharrao\\OneDrive - Bookwater Tech Private Limited\\Desktop\\ChromeDriver\\chromedriver-win64 (version-0.0.130)\\chromedriver-win64\\chromedriver.exe");
		

				//"C:\\Users\\Milind Manoharrao\\OneDrive - Bookwater Tech Private Limited\\Desktop\\ChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new Home(driver);
		driver.navigate().to("https://loginstage.bookwater.com/authenticate");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	public void Page_Title_should_be_Home() {
		String expResult = "Dashboard";
		String actResult = lp.homePage();
		Assert.assertEquals(actResult, expResult);
	}

	/*
	 * @Given("Admin Home page") public void admin_home_page() { lp.homePageTitle();
	 * 
	 * }
	 */
	@When("check Dashboard button text is display")
	public void check_dashboard_button_text_is_display() {
		lp.credentialTitleText();
	}

	@Then("check dashboard button text")
	public void check_dashboard_button_text() {
		String[] elements = { "Dashboard", "Super Admin", "SKU", "Users", "Orders","Postpaid", "Transactions",
				"WFS Details", "Product Grouping","Can Swap", "Reports", "Marketing", "Settings" };
		for (int i = 1; i <= 12; i++) {
			String actResult = lp.dashbuttons(i).getText();
			System.out.println(actResult);
			String expResult = elements[i - 1];
			Assert.assertEquals(actResult, expResult);
		}
	}

	@Then("check Logout button functionality")
	public void check_logout_button_functionality() {
		boolean actResult = lp.logoutButtonFunctionality().isEnabled();
		boolean expResult = true;
		// System.out.println(actResult);
		Assert.assertEquals(actResult, expResult);
	}

	@When("click on Logout button")
	public void logoutlink() throws InterruptedException {
		lp.logoutlink();
		;
	}

	@Then("Check Login text")
	public void Check_Login_text() {
		String actResult = lp.afterLogoutLogin();
		String expResult = "Login";
		// System.out.println(expResult +" after logout check text");
		Assert.assertEquals(actResult, expResult);
	}

	@Before("@wait")
	public void doingWait() {
		try {
			 System.out.println("Waiting for 2 sec..");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@AfterStep
	public void takeScreenshotOnFailure(Scenario scenario) {

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}

	}

}
