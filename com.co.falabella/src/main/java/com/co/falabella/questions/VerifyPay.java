package com.co.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.co.falabella.userinterfaces.PayProduct.BUTTON_CARD_PAY;

public class VerifyPay implements Question <Boolean>{
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(BUTTON_CARD_PAY.resolveAllFor(actor).contains("Ingresar tarjeta"));
        return true;

    }
    public static Question<Boolean> veification() {
        return new VerifyPay();
    }
}
