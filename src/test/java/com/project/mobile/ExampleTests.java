package com.project.mobile;

import com.project.pages.mobile.HomePageMobile;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExampleTests extends BaseMobileTest {

    @Test
    public void test() {
        HomePageMobile homePageMobile = new HomePageMobile(driver);
        boolean isDisplay = homePageMobile.isButtonDisplay();
        Assert.assertTrue(isDisplay, "Search button is not display");
    }

}