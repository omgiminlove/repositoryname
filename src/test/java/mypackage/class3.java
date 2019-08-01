package mypackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class3 {
	WebDriver driver;
	
	@Given("user opens test me app home page")
	public void user_opens_test_me_app_home_page() {
	    System.out.println("Login");
	    System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user clicks sign in")
	public void user_clicks_sign_in() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters username as {string} and the password as {string}")
	public void user_enters_username_as_and_the_password_as(String string, String string2) {
		   driver.findElement(By.name("userName")).sendKeys(string);
		    driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("Click on Login");
		driver.findElement(By.name("Login")).click();
	}

	@Then("Validate the result now")
	public void validate_the_result_now() {
		System.out.println("Result Validated");
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	    driver.close();
	}

}
