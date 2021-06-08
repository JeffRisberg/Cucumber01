package com.company.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

  private static Belly belly = new Belly();

  @Given("I have {int} cukes in my belly")
  public void I_have_cukes_in_my_belly(int cukes) {
    belly.eat(cukes);
  }

  @When("Eat {int} cukes")
  public void eat(int cukes) {
    belly.eat(cukes);
  }

  @Then("Have {int} cukes")
  public void have(int cukes) {
    int count = belly.getCount();

    assertEquals(count, cukes);
  }
}
