package test_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

     driver.get("http://demowebshop.tricentis.com/");

     driver.manage().window().maximize();
	}

	@Given("^Click on Login Link$")
	public void click_on_Login_Link() throws Throwable {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click login$")
	public void enter_and_and_click_login(String email, String password) throws Throwable {
		 driver.findElement(By.id("Email")).sendKeys(email);

		    driver.findElement(By.id("Password")).sendKeys(password);

		    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		    driver.close();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    	 System.out.println(" login was successful ");
	}
}
