Feature: Booking flights
    As a user
    I want to be able to make a booking
    So that I can reserve a flight

    Background:
        Given the user is on the booking page

    Scenario: The user makes a booking successfully
        When the user selects the flight "Cartagena - Cali"
        And the user enters the passenger details as follows:
            | name   | lastName | email            | phone      | typeDni                  | dni   | nationality | age |
            | Esteban | Bonilla    | estebanbb@gmail.com | 12345670 | Cedula de Ciudadania     | 22 | Colombia    | 25  |
        And the user confirms the booking
        Then the system should display the booking confirmation: "Reserva guardada"


    Scenario: The user makes a booking with invalid data
        When the user selects the flight "Cartagena - Cali"
        And the user tries to confirm the booking with invalid data
        Then the system should display an error message

    Scenario: retreve all bookings
        When the user navigates to the booking history
        Then the system should display all bookings

    Scenario: delete a booking
        When the user navigates to the booking history
        And the user deletes a booking
        Then the system should display the message "Reserva de pasajero eliminada"

    Scenario: update a booking
        When the user navigates to the booking history
        And the user updates a booking with the following data:
            | lastName |
            | Morales |
        Then the system should display the message "Pasajero actualizado"