package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayProduct {
    public static final Target BUTTON_PAY = Target.the("Button pay").
            located(By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));
    public static final Target MAIL = Target.the("Button pay").
            located(By.id("emailAddress"));
    public static final Target BUTTON_MAIL = Target.the("Button continuar").
            located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton']"));
    public static final Target REGION = Target.the("Button pay").
            located(By.id("region"));
    public static final Target OPTION_REGION = Target.the("Option region").
            located(By.xpath("//option[contains(text(),'ANTIOQUIA')]"));
    public static final Target CIUDAD = Target.the("Button pay").
            located(By.id("ciudad"));
    public static final Target SELECT_CIUDAD = Target.the("Option region").
            located(By.xpath("//option[contains(text(),'MEDELLIN')]"));
    public static final Target BARRIO = Target.the("Button Barrio").
            located(By.id("comuna"));
    public static final Target SELECT_BARRIO = Target.the("Select barrio").
            located(By.xpath("(//option[contains(text(),'MEDELLIN')])[2]"));
    public static final Target BUTTON_CONTINUAR = Target.the("Button continuar").
            located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']"));
    public static final Target ADDRESS = Target.the("Button Barrio").
            located(By.id("address"));
    public static final Target APARTMENT = Target.the("ButtON ADDRESS").
            located(By.id("departmentNumber"));
    public static final Target BUTTON_ADDRESS = Target.the("ButtON ADDRESS").
            located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']"));
    public static final Target BUTTON_GO_TU_PAY = Target.the("ButtON ADDRESS").
            located(By.xpath("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));
    public static final Target BUTTON_CARD_PAY = Target.the("Button Barrio").
            located(By.id("btn-pagar"));
}
