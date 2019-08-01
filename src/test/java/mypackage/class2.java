package mypackage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class2 {


@When("user enter {int}")
public void user_enter(Integer i) {
 System.out.println(i);
}

@When("user press plus")
public void user_press_plus() {
	 System.out.println("Plus");
}

@When("user enters second value as {int}")
public void user_enters_second_value_as(Integer j) {
	 System.out.println(j);
}

@Then("the user presses equal")
public void the_user_presses_equal() {
	 System.out.println("equals");
}

@Then("validate the output as {int}")
public void validate_the_output_as(Integer k) {
	 System.out.println(k);
}

}
