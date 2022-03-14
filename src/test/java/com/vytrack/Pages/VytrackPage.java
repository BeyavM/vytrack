package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {

    public VytrackPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='The application is not configured properly (message consumers are not available). Please contact the system administrator.']")
    public WebElement projectPageWarningMessage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement odometerPageWarningMessage;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinbarImg;
}
