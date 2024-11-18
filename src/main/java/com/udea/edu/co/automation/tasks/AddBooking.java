package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.ConfirmBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddBooking implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ConfirmBooking.next());
    }

    public static AddBooking next() {
        return Tasks.instrumented(AddBooking.class);

    }
    
}
