package com.project;

import com.project.core.ChromeDriverManager;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeClass
    public void start(){
        driver = new ChromeDriverManager().getDriver();
    }
    @BeforeMethod
    public void open(){
        driver.get("https://www.google.com/");
    }
    @AfterMethod
    public void close(){
       driver.quit();
    }
}
