package mypackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class1 {
	WebDriver driver;
	
	@When("user opens newtours appliaction on chrome browser")
	public void user_opens_newtours_appliaction_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}


@When("user enters {string} As username and password")
public void user_enters_As_username_and_password(String credentials) {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("Click on Submit button")
	public void click_on_Submit_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("veify login result")
	public void veify_login_result() {
	    Assert.assertTrue(driver.getTitle().contains("Flight"));
	    driver.close();
	}
}
