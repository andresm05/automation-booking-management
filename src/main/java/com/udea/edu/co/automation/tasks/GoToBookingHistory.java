package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.booking.NavigateBookingHistory;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoToBookingHistory implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(NavigateBookingHistory.next());
    }

    public static GoToBookingHistory url() {
        return Tasks.instrumented(GoToBookingHistory.class);

    }

}
