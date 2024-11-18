package com.udea.edu.co.automation.questions;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.BOOKINGS_TABLE_TITLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BookingHistory implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verifica si el mensaje de confirmación es visible
        return BOOKINGS_TABLE_TITLE.resolveFor(actor).isVisible();
    }

    public static BookingHistory isDisplayed() {
        return new BookingHistory();
    }
}
