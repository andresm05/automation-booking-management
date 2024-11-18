package com.udea.edu.co.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

public class BookingConfirmation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verifica si el mensaje de confirmación es visible
        return CONFIRMATION_MESSAGE.resolveFor(actor).isVisible();
    }

    public static BookingConfirmation isDisplayed() {
        return new BookingConfirmation();
    }
}
