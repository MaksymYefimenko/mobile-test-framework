package com.project.core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected static WebDriver driver;

    protected abstract void createDriver();

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
}
