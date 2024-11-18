Feature: Booking flights
    As a user
    I want to be able to make a booking
    So that I can reserve a flight

    Background:
        Given the user is on the booking page

    Scenario: The user makes a booking successfully
        When the user selects the flight "Cartagena - Cali"
        And the user enters the passenger details as follows:
            | name   | lastName | email            | phone      | typeDni                  | dni        | nationality | age |
            | Alicia | Paez    | alia@gmail.com | 1234567890 | Cedula de Ciudadania     | 123433700 | Colombia    | 25  |
        And the user confirms the booking
        Then the system should display the booking confirmation
