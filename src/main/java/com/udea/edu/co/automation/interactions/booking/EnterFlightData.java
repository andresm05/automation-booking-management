package com.udea.edu.co.automation.interactions.booking;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;

public class EnterFlightData implements Interaction {

    private final String flight;

    public EnterFlightData(String flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(flight).from(SELECT_FLIGHT)
        );
    }

    public static EnterFlightData flight(String flight) {
        return Tasks.instrumented(EnterFlightData.class, flight);
    }

}
