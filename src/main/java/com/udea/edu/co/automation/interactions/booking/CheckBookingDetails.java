package com.udea.edu.co.automation.interactions.booking;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.BUTTON_VIEW_DETAILS;

import com.udea.edu.co.automation.interactions.passenger.ConfirmPassengerData;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CheckBookingDetails implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTON_VIEW_DETAILS));

    }

    public static ConfirmPassengerData next() {
        return Tasks.instrumented(ConfirmPassengerData.class);

    }
}
