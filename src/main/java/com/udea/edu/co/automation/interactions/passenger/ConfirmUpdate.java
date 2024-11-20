package com.udea.edu.co.automation.interactions.passenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

public class ConfirmUpdate implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(EDIT_BUTTON));
    }

    public static ConfirmUpdate modify() {
        return Tasks.instrumented(ConfirmUpdate.class);

    }
}
