package com.udea.edu.co.automation.interactions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;


public class NavigateBookingHistory implements Interaction{
        @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTON_VIEW_HISTORY));
    }

    public static NavigateBookingHistory next() {
        return Tasks.instrumented(NavigateBookingHistory.class);

    }
}
