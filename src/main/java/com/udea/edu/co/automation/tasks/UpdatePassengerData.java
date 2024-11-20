package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.ViewBookingDetails;
import com.udea.edu.co.automation.interactions.passenger.ConfirmUpdate;
import com.udea.edu.co.automation.interactions.passenger.ModifyPassengerData;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UpdatePassengerData implements Task {

    private final String lastName;

    public UpdatePassengerData(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ViewBookingDetails.navigateTo());
        actor.attemptsTo(ModifyPassengerData.withData(lastName));
        actor.attemptsTo(ConfirmUpdate.modify());
    }

    public static UpdatePassengerData withlastName(String lastName) {
        return Tasks.instrumented(UpdatePassengerData.class, lastName);
    }
}
