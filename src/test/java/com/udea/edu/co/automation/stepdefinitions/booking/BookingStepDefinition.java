package com.udea.edu.co.automation.stepdefinitions.booking;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import com.udea.edu.co.automation.questions.BookingConfirmation;
import com.udea.edu.co.automation.questions.BookingAlterConfirmation;
import com.udea.edu.co.automation.questions.BookingError;
import com.udea.edu.co.automation.questions.BookingHistory;
import com.udea.edu.co.automation.tasks.AddBooking;
import com.udea.edu.co.automation.tasks.AddBookingWithoutData;
import com.udea.edu.co.automation.tasks.ConfirmDeleteBooking;
import com.udea.edu.co.automation.tasks.FillFlight;
import com.udea.edu.co.automation.tasks.FillPassengerData;
import com.udea.edu.co.automation.tasks.GoToBookingHistory;
import com.udea.edu.co.automation.tasks.OpenUrl;
import com.udea.edu.co.automation.tasks.UpdatePassengerData;
import com.udea.edu.co.automation.utils.Constants;
import static com.udea.edu.co.automation.utils.Constants.sleep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookingStepDefinition {

    //Actor
    private final Actor user = Actor.named("user");

    //driver
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("the user is on the booking page")
    public void theUserIsOnTheBookingPage() {
        user.attemptsTo(OpenUrl.url(Constants.URL_HOME));
    }

    @When("the user selects the flight {string}")
    public void theUserSelectsTheFlight(String flight) {
        user.attemptsTo(FillFlight.withFlight(flight));
        sleep(1000);
    }

    @When("the user navigates to the booking history")
    public void theUserNavigatesToTheBookingHistory() {
        user.attemptsTo(GoToBookingHistory.url());
        sleep(1000);
    }

    @And("the user enters the passenger details as follows:")
    public void theUserEntersThePassengerDetails(DataTable dataTable) {
        List<Map<String, String>> passengerDetails = dataTable.asMaps(String.class, String.class);

        passengerDetails.forEach(
                passenger -> {
                    user.attemptsTo(
                            FillPassengerData.withData(
                                    passenger.get("name"),
                                    passenger.get("lastName"),
                                    passenger.get("email"),
                                    passenger.get("phone"),
                                    passenger.get("typeDni"),
                                    passenger.get("dni"),
                                    passenger.get("nationality"),
                                    Integer.parseInt(passenger.get("age"))
                            ));
                });

        sleep(1000);

    }

    @And("the user updates a booking with the following data:")
    public void theUserUpdatesABookingWithTheFollowingData(DataTable dataTable) {
        List<Map<String, String>> passengerDetails = dataTable.asMaps(String.class, String.class);

        passengerDetails.forEach(
                passenger -> {
                    user.attemptsTo(
                            UpdatePassengerData.withlastName(
                                    passenger.get("lastName")
                            )
                    );
                });

        sleep(1000);
        
    }

    @And("the user confirms the booking")
    public void theUserConfirmsTheBooking() {
        user.attemptsTo(AddBooking.next());
    }

    @And("the user tries to confirm the booking with invalid data")
    public void theUserTriesToConfirmTheBookingWithInvalidData() {
        user.attemptsTo(AddBookingWithoutData.withInvalidData());
        sleep(1000);
    }

    @And("the user deletes a booking")
    public void theUserDeletesABooking() {
        user.attemptsTo(ConfirmDeleteBooking.remove());
        sleep(1000);
    }

    @Then("the system should display the booking confirmation: {string}")
    public void theSystemShouldDisplayTheBookingConfirmation(String message) {
        sleep(2000);
        user.should(seeThat(
                BookingConfirmation.desplaysMessage(message),
                equalTo(true)
        ));
    }

    @Then("the system should display the message {string}")
    public void theSystemShouldDisplayTheMessage(String message) {
        sleep(2000);
        user.should(seeThat(
                BookingAlterConfirmation.displaysMessage(message),
                equalTo(true)
        ));
    }

    @Then("the system should display all bookings")
    public void theSystemShouldDisplayTheBookingHistory() {
        sleep(2000);
        user.should(seeThat(
                BookingHistory.isDisplayed(),
                equalTo(true)
        ));
    }

    @Then("the system should display an error message")
    public void theSystemShouldDisplayAnErrorMessage() {
        sleep(2000);
        user.should(seeThat(
                BookingError.isDisplayed(),
                equalTo(true)
        ));
    }

}
