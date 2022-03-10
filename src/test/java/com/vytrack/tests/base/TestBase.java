package com.vytrack.tests.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class TestBase {
    @BeforeMethod
    public void setUp() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("Test base is started");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
