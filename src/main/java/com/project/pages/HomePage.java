package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(how= How.NAME,using="q")
    private WebElement searchField;

    @FindBy(how= How.NAME,using="btnK")
    private WebElement searchButton;
    //WebDriver

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public boolean isSearchButtonDisplay(){
        return searchButton.isDisplayed();
    }
}
