package com.project.pages.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMobile {
    private AppiumDriver<MobileElement> driver;
    @AndroidFindBy(id = "test")
    @iOSXCUITFindBy(accessibility = "test")
    private MobileElement button;

    public HomePageMobile(AppiumDriver<MobileElement> driver) {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public boolean isButtonDisplay(){
        return button.isDisplayed();
    }
}
