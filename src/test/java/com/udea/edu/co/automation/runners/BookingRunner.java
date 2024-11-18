package com.udea.edu.co.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/booking/booking.feature",
        glue = "com.udea.edu.co.automation.stepdefinitions.booking",
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BookingRunner {}