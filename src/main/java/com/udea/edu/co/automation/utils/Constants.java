package com.udea.edu.co.automation.utils;

import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class Constants {
    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    public static final String URL_HOME = environmentVariables.getProperty("webdriver.base.url");

    public static void sleep (int time) {
        try {
            Thread.sleep(time); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}