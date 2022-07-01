package com.co.falabella.tasks;

import com.co.falabella.interations.AcceptPopup;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.co.falabella.userinterfaces.PayProduct.*;
import static com.co.falabella.userinterfaces.SelectProduct.*;
import static com.co.falabella.utils.Constant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductSelectionAndPurchase implements Task {
//WebDriver driver = new ChromeDriver();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                Click.on(CLOSE_NOTICE),
                Enter.theValue(NAME_PRODUCT).into(SEARCH).thenHit(Keys.ENTER),
                Click.on(SELECT_PRODUCT),
                Click.on(BUTTON_AGG_PRODUCT),
                Click.on(BUTTON_SEE_PRODUCT),
                Click.on(BUTTON_PAY),
                Enter.theValue(MY_MAIL).into(MAIL),
                Click.on(BUTTON_MAIL),
                Click.on(REGION),
                Click.on(OPTION_REGION),
               Click.on(CIUDAD),
               Click.on(SELECT_CIUDAD),
               Click.on(BARRIO),
               Click.on(SELECT_BARRIO),
               Click.on(BUTTON_CONTINUAR),
                Enter.theValue(MY_ADDRESS).into(ADDRESS),
                Enter.theValue(MY_APARTMENT).into(APARTMENT),
                Click.on(BUTTON_ADDRESS),
                Click.on(BUTTON_GO_TU_PAY)



                // Enter.theValue("Antioquia").into(REGION).thenHit(Keys.ENTER)

                );





    }
    public static ProductSelectionAndPurchase selectionAndPurchase(){
        return instrumented(ProductSelectionAndPurchase.class);
    }
}
