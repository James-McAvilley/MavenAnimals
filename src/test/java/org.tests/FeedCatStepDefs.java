package org.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedCatStepDefs {
    boolean isHungry;
    boolean isFull = false;

    @Given("cat is hungry")
    public void cat_is_hungry(){
        isHungry = true;
    }

    @When("i feed cat")
    public void feedCat(){
        isHungry = false;
    }

    @Then("cat is not hungry")
    public void catFed(){
        isFull =true;
    }

}
