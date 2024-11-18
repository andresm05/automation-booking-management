package com.udea.edu.co.automation.interactions.passenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmPassengerData implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTON_CONFIRM_PASSENGER));
        actor.attemptsTo(Click.on(BUTTON_VIEW_DETAILS));

    }

    public static ConfirmPassengerData next() {
        return Tasks.instrumented(ConfirmPassengerData.class);

    }
}
