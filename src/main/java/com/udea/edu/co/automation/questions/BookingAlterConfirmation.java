package com.udea.edu.co.automation.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Actor;

public class BookingAlterConfirmation implements Question<Boolean> {

    private final String expectedMessage;

    public BookingAlterConfirmation(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualMessage = Text.of(CONFIRMATION_MESSAGE).answeredBy(actor);
        return actualMessage.equals(expectedMessage);
    }

    public static BookingAlterConfirmation displaysMessage(String expectedMessage) {
        return new BookingAlterConfirmation(expectedMessage);
    }

}
