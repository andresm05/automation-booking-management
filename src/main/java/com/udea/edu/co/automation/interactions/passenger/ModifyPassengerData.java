package com.udea.edu.co.automation.interactions.passenger;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

public class ModifyPassengerData implements Interaction {

    private final String lastName;

    public ModifyPassengerData(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //modify the last name
                Enter.theValue(lastName).into(INPUT_UPDATE_LASTNAME)
        );
    }

    public static ModifyPassengerData withData(String lastName) {
        return Tasks.instrumented(ModifyPassengerData.class, lastName);
    }

}
