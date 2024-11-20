package com.udea.edu.co.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class BookingPage extends PageObject{
    
    public static final Target SELECT_FLIGHT = Target
    .the("Select flight")
    .locatedBy("//*[@id=\"flight\"]");

    public static final Target BUTTON_NEXT = Target
    .the("Button next")
    .locatedBy("//*[@id=\"rightArrow\"]");

    public static final Target INPUT_NAME = Target
    .the("Input name")
    .locatedBy("//*[@id=\"name\"]");

    public static final Target INPUT_LASTNAME = Target
    .the("Input lastname")
    .locatedBy("//*[@id=\"lastName\"]");

    public static final Target INPUT_EMAIL = Target
    .the("Input email")
    .locatedBy("//*[@id=\"email\"]");

    public static final Target INPUT_PHONE = Target
    .the("Input phone")
    .locatedBy("//*[@id=\"phone\"]");

    public static final Target SELECT_TYPEDNI = Target
    .the("Select type dni")
    .locatedBy("//*[@id=\"typeDni\"]");

    public static final Target INPUT_DNI = Target
    .the("Input dni")
    .locatedBy("//*[@id=\"dni\"]");

    public static final Target INPUT_NATIONALITY = Target
    .the("nationality")
    .locatedBy("//*[@id=\"nationality\"]");

    public static final Target INPUT_AGE = Target
    .the("Input age")
    .locatedBy("//*[@id=\"age\"]");

    public static final Target BUTTON_CONFIRM_PASSENGER = Target
    .the("Button confirm passenger")
    .locatedBy("//*[@id=\"submitPassenger\"]");

    public static final Target BUTTON_VIEW_DETAILS = Target
    .the("Button view details")
    .locatedBy("//*[@id=\"rightArrow2\"]");

    public static final Target BUTTON_CONFIRM_BOOKING = Target
    .the("Button confirm booking")
    .locatedBy("//*[@id=\"submitBooking\"]");

    public static final Target CONFIRMATION_MESSAGE = Target
    .the("Confirmation message")
    .locatedBy("//*[@id=\"swal2-title\"]");

    public static final Target ERROR_MESSAGE = Target
    .the("Error message")
    .locatedBy("//*[@id=\"swal2-html-container\"]");

    public static final Target BUTTON_VIEW_HISTORY = Target
    .the("Button view history")
    .locatedBy("//*[@id=\"viewBookings\"]");

    public static final Target BOOKINGS_TABLE_TITLE = Target
    .the("Bookings table title")
    .locatedBy("//*[@id=\"bookingList\"]");

    public static final Target DELETE_BUTTON = Target
    .the("Delete button")
    .locatedBy("//*[@id=\"delete30\"]");

    public static final Target CONFIRM_DELETE_BUTTON = Target
    .the("Confirm delete button")
    .locatedBy("//*[@id=\"confirmDelete30\"]");

    public static final Target VIEW_BOOKING_BUTTON = Target
    .the("View booking button")
    .locatedBy("//*[@id=\"search31\"]");

    public static final Target EDIT_BUTTON = Target
    .the("Edit button")
    .locatedBy("//*[@id=\"confirmUpdate\"]");

    public static final Target INPUT_UPDATE_LASTNAME = Target
    .the("Input update lastname")
    .locatedBy("//*[@id=\"lastName-update\"]");
}
