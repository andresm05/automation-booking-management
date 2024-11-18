package com.udea.edu.co.automation.tasks;

import com.udea.edu.co.automation.interactions.passenger.ConfirmPassengerData;
import com.udea.edu.co.automation.interactions.passenger.EnterPassengerData;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillPassengerData implements Task {

    private final String name;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String typeDni;
    private final String dni;
    private final String nationality;
    private final int age;

    public FillPassengerData(String name, String lastName, String email, String phone, String typeDni, String dni, String nationality, int age) {
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
                EnterPassengerData.withData(name, lastName, email, phone, typeDni, dni, nationality, age),
                ConfirmPassengerData.next()
        );
    }

    public static FillPassengerData withData(String name, String lastName, String email, String phone, String typeDni, String dni, String nationality, int age) {
        return Tasks.instrumented(FillPassengerData.class, name, lastName, email, phone, typeDni, dni, nationality, age);
    }
}
