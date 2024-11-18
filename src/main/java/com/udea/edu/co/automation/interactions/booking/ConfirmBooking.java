package com.udea.edu.co.automation.interactions.booking;

import net.serenitybdd.screenplay.Actor;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmBooking implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTON_CONFIRM_BOOKING));
    }

    public static ConfirmBooking next() {
        return Tasks.instrumented(ConfirmBooking.class);

    }

}
