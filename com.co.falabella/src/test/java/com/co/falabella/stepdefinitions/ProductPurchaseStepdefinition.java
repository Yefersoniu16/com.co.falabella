package com.co.falabella.stepdefinitions;

import com.co.falabella.questions.VerifyPay;
import com.co.falabella.tasks.ProductSelectionAndPurchase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductPurchaseStepdefinition {

    @Before
    public void setThetago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Yeferson");
    }

    @Given("^i want to open the page$")
    public void iWantToOpenThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));

    }

    @When("^i make the selection and send the product to stock exchange$")
    public void iMakeTheSelectionAndSendTheProductToStockExchange() {
        theActorInTheSpotlight().attemptsTo(ProductSelectionAndPurchase.selectionAndPurchase());

    }

    @Then("^view the value to pay$")
    public void viewTheValueToPay() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyPay.veification()));

    }
}
