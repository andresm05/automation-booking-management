package com.udea.edu.co.automation.stepdefinitions.booking;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.udea.edu.co.automation.questions.BookingConfirmation;
import com.udea.edu.co.automation.tasks.AddBooking;
import com.udea.edu.co.automation.tasks.FillFlight;
import com.udea.edu.co.automation.tasks.FillPassengerData;
import com.udea.edu.co.automation.tasks.OpenUrl;
import com.udea.edu.co.automation.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.udea.edu.co.automation.utils.Constants.sleep;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BookingSuccessFullStepDefinition {

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

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("author");
    }

    @Given("the user is on the booking page")
    public void theUserIsOnTheBookingPage() {
        user.attemptsTo(OpenUrl.url(Constants.URL_HOME));
    }

    @When("the user selects the flight {string}")
    public void theUserSelectsTheFlight(String flight) {
        user.attemptsTo(FillFlight.withFlight(flight));
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

    @And("the user confirms the booking")
    public void theUserConfirmsTheBooking() {
        user.attemptsTo(AddBooking.next());
    }

    @Then("the system should display the booking confirmation")
    public void theSystemShouldDisplayTheBookingConfirmation() {
        user.should(seeThat(
                BookingConfirmation.isDisplayed(),
                equalTo(true)
        ));
    }

}
