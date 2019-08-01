package mypackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class class4 {
	WebDriver driver;
	
	@When("user login to flight booking site")
	public void user_login_to_flight_booking_site() {
	   System.out.println("Login");
		System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com"); 
	    driver.findElement(By.name("userName")).sendKeys(" ");
	    driver.findElement(By.name("password")).sendKeys(" ");
	}

	@When("verify login to flight booking site is success")
	public void verify_login_to_flight_booking_site_is_success() {
		System.out.println("Success");
		 Assert.assertTrue(driver.getTitle().contains("Flight"));
	}

	@When("user searches flight giving required detials")
	public void user_searches_flight_giving_required_detials() {
		System.out.println("Search");
	}

	@When("verify search related flight is dispalyed")
	public void verify_search_related_flight_is_dispalyed() {
		System.out.println("search diplayed");
		}

	@When("user clicks on order button")
	public void user_clicks_on_order_button() {
		System.out.println("order button clcked");
	}

	@When("verify Flight details get added to cart")
	public void verify_Flight_details_get_added_to_cart() {
		System.out.println("added to cart");
	}

	@When("user clicks cart")
	public void user_clicks_cart() {
		System.out.println("Cart Clicked");
	}

	@When("verify payment page is displayed")
	public void verify_payment_page_is_displayed() {
		System.out.println("Payment Page");
	}

	@When("user selects netbanking")
	public void user_selects_netbanking() {
		System.out.println("Netbanking Selected");
	}

	@Then("user completes payment")
	public void user_completes_payment() {
		System.out.println("payment Completed");
	}

	@Then("verify payment success")
	public void verify_payment_success() {
		System.out.println("Payment success");
	}
}
