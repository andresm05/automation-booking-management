package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.CheckBookingDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddBookingWithoutData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(CheckBookingDetails.next());

    }

    public static AddBookingWithoutData withInvalidData() {
        return Tasks.instrumented(AddBookingWithoutData.class);

    }
    
}
