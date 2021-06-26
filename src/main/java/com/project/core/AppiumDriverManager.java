package com.project.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDriverManager {
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private AppiumDriver<MobileElement> driver;

    public AppiumDriver<MobileElement> criateAndroidDriverWithCapabilitys(AppiumDriverLocalService server) {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
       // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/maksymyefimenko/IdeaProjects/mobile-test-framework/src/main/resources/ApiDemos-debug.apk");

        driver = new AndroidDriver<>(server, capabilities);

        ((AndroidDriver<MobileElement>) driver).startActivity(new Activity("io.appium.android.apis", ".view.TextFields"));
        return driver;

    }

    public AppiumDriver<MobileElement> criateIOSDriverWithCapabilitys(AppiumDriverLocalService server) {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "PUT_YOUR_XCODE_VERSION_HERE");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCuiTest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PUT_YOUR_DEVICE_NAME_HERE");
        capabilities.setCapability(MobileCapabilityType.UDID, "PUT_YOUR_DEVICE_UDID_HERE");
        capabilities.setCapability(MobileCapabilityType.APP, "/src/main/resources/TestApp.app1.zip");


        driver = new IOSDriver<>(server, capabilities);
        return driver;


    }

}
