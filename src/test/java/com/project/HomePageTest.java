package com.project;

import com.project.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void testButtonDisplay() {
        HomePage homePage = new HomePage(driver);
        boolean isDisplay = homePage.isSearchButtonDisplay();
        Assert.assertTrue(isDisplay,"Search button is not display");
    }
}
