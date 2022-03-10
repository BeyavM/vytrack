package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US10_Writing_Messages extends TestBase {
   @Test
   public void writing_message_successfully(){

      //step1-user go to homepage as sale manager
      VytrackUtils.loginAsSalesManager();
     //step2- user go to Activities Tab and hover over
      String ActivitiesElementLocator="//span[normalize-space()='Activities' and contains (@class,'title title-level-1')]";
     WebElement ActivitiesElement= Driver.getDriver().findElement(By.xpath(ActivitiesElementLocator));
      Actions actions=new Actions(Driver.getDriver());
      actions.moveToElement(ActivitiesElement).perform();
      BrowserUtils.sleep(3);
   }
}
