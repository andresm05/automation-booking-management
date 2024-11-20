package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.DeleteBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConfirmDeleteBooking implements Task{

    
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(DeleteBooking.remove());

    }

    public static ConfirmDeleteBooking remove() {
        return Tasks.instrumented(ConfirmDeleteBooking.class);

    }
    
}
