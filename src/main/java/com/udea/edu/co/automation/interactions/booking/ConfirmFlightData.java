package com.udea.edu.co.automation.interactions.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Tasks;


public class ConfirmFlightData implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(BUTTON_NEXT));
    }

    public static ConfirmFlightData next() {
        return Tasks.instrumented(ConfirmFlightData.class);
    }
    
}
