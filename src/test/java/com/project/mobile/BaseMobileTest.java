package com.project.mobile;

import com.project.core.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseMobileTest {
    private AppiumDriverLocalService server;
    protected AppiumDriver<MobileElement> driver;

    @BeforeClass
    private void setUp() {
        String platform = System.getProperty("APPIUM_DRIVER");
        platform = platform == null ? "ANDROID" : platform.toUpperCase();


        if (platform.equals("ANDROID")) {
            server = new AppiumServiceBuilder().usingAnyFreePort().build();
            server.start();
            driver = new AppiumDriverManager().criateAndroidDriverWithCapabilitys(server);

        } else {
            server = new AppiumServiceBuilder().usingAnyFreePort().build();
            server.start();
            driver = new AppiumDriverManager().criateIOSDriverWithCapabilitys(server);
        }
    }

    @AfterClass
    public void tearDown() {
        server.stop();
        driver.quit();
    }
}
