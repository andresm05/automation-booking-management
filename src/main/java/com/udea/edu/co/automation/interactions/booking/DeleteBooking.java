package com.udea.edu.co.automation.interactions.booking;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class DeleteBooking implements Interaction{
      @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DELETE_BUTTON));
        actor.attemptsTo(Click.on(CONFIRM_DELETE_BUTTON));
    }

    public static DeleteBooking remove() {
        return Tasks.instrumented(DeleteBooking.class);

    }
}
