package com.udea.edu.co.automation.interactions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Interaction;

public class ViewBookingDetails implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VIEW_BOOKING_BUTTON));
    }

    public static ViewBookingDetails navigateTo() {
        return Tasks.instrumented(ViewBookingDetails.class);
    }
}
