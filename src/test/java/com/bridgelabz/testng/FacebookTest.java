package com.bridgelabz.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest extends BaseClass {

    @Test
    public void launchFB_Application() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/login/");
        Thread.sleep(500);

        String actualTitle = "Log in to Facebook";
        String title = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
    }

    @Test
    public void launchFK_Application() throws InterruptedException {
        driver.get("https://www.flipkart.com");
        Thread.sleep(1000);
    }
}
