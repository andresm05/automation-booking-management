package com.udea.edu.co.automation.interactions.passenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static com.udea.edu.co.automation.userinterfaces.BookingPage.*;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterPassengerData implements Interaction {

    private final String name;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String typeDni;
    private final String dni;
    private final String nationality;
    private final int age;

    public EnterPassengerData(String name, String lastName, String email, String phone, String typeDni, String dni, String nationality, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.typeDni = typeDni;
        this.dni = dni;
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Enter the name
                Enter.theValue(name).into(INPUT_NAME),
                // Enter the last name
                Enter.theValue(lastName).into(INPUT_LASTNAME),
                // Enter the email
                Enter.theValue(email).into(INPUT_EMAIL),
                // Enter the phone
                Enter.theValue(phone).into(INPUT_PHONE),
                // Select the type of DNI
                SelectFromOptions.byVisibleText(typeDni).from(SELECT_TYPEDNI),
                // Enter the DNI
                Enter.theValue(dni).into(INPUT_DNI),
                // Select the nationality
                SelectFromOptions.byVisibleText(nationality).from(INPUT_NATIONALITY),
                // Enter the age
                Enter.theValue(String.valueOf(age)).into(INPUT_AGE)
        );

    }

    public static EnterPassengerData withData(String name, String lastName, String email, String phone, String typeDni, String dni, String nationality, int age) {
        return Tasks.instrumented(EnterPassengerData.class, name, lastName, email, phone, typeDni, dni, nationality, age);
    }
}
