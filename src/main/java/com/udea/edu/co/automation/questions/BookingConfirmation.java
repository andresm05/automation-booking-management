package com.udea.edu.co.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

public class BookingConfirmation implements Question<Boolean> {

    private final String expectedMessage;

    public BookingConfirmation(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // verify the confirmation message 
        String actualMessage = Text.of(CONFIRMATION_MESSAGE).answeredBy(actor);
        return actualMessage.equals(expectedMessage);
    }

    public static BookingConfirmation desplaysMessage(String expectedMessage) {
        return new BookingConfirmation(expectedMessage);
    }
}
