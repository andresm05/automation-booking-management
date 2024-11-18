package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.ConfirmFlightData;
import com.udea.edu.co.automation.interactions.booking.EnterFlightData;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillFlight implements Task {

    private final String flight;

    public FillFlight(String flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(EnterFlightData.flight(flight));
        actor.attemptsTo(ConfirmFlightData.next());
    }

    public static FillFlight withFlight(String flight) {
        return Tasks.instrumented(FillFlight.class, flight);
    }

}
