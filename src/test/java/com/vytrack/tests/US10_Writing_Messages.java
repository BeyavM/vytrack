package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.VytrackUtils;
import org.testng.annotations.Test;

public class US10_Writing_Messages extends TestBase {
   @Test
   public void writing_message_successfully(){

      //step1-user go to homepage as sale manager
      VytrackUtils.loginAsSalesManager();

   }
}
