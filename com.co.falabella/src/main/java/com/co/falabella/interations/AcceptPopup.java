package com.co.falabella.interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceptPopup implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public static AcceptPopup acceptPopup(){
        return Tasks.instrumented(AcceptPopup.class);

    }
}
