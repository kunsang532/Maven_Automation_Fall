package Action_Item;

import Day9.Reusable_Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Action_Item5thWeek {
    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
    }
    // End of pre condition

    @Test
    public void testcase1() throws InterruptedException {
        // Declare Email variables
        ArrayList<String> email = new ArrayList<>();
        email.add("kusaun997726@gmail.com");
        email.add("Shahu6k6mk2h7han132@gmail.com");

        // Declare password variables
        ArrayList<String> password = new ArrayList<>();
        password.add("kunsang532");
        password.add("Kathmandu");

        //Declare Variable name
        ArrayList<String> name = new ArrayList<>();
        name.add("Kunsan");
        name.add("SRKk");

        //Declare Variable month
        ArrayList<String> month = new ArrayList<>();
        month.add("February");
        month.add("March");

        //Declare variable Day
        ArrayList<String> day = new ArrayList<>();
        day.add("1");
        day.add("2");

        //Declare Variable year
        ArrayList<String> year = new ArrayList<>();
        year.add("1996");
        year.add("1995");

        //Declare  Variable gender
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Male");

        for (int i = 0; i < email.size(); i++) {
            // Navigate to Hulu
            driver.navigate().to("https://www.hulu.com");

            //Verify the Tittle"Stream TV and Movies
            String actualTittle = driver.getTitle();
            if (actualTittle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("This Tittle is Matched");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTittle);
            }

            //Scroll Down to he bottom
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,3350)");


            //Click on Select button
            Reusable_Actions.clickMethod(driver, "//*[text()='SELECT']", "Select");

            //Click on Email
            Reusable_Actions.clickMethod(driver, "//*[@id='email']", "email");

            //Input the email
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email']", email.get(i), "email");

            //Click on password
            Reusable_Actions.clickMethod(driver, "//*[@id='password']", "password");

            //Input the password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']", password.get(i), "password");

            //Click on Name
            Reusable_Actions.clickMethod(driver, "//*[@id='firstName']", "name");

            //Input the name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']", name.get(i), "name");

            //Click on Month
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "month");

            // Select Month
            Reusable_Actions.clickMethod(driver, "//*[text()='" + month.get(i) + "']", "month");

            //Click on day
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "day");

            //Select DAy
            Reusable_Actions.clickMethod(driver, "//*[text()='" + day.get(i) + "']", "day");

            //Click on year
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "year");

            //Select year
            Reusable_Actions.clickMethod(driver, "//*[text()='" + year.get(i) + "']", "year");

            //click on gender
            Reusable_Actions.clickMethod(driver, "//*[@class='selector-selected input__text placeholder']", "gender");

            // Select the gender
            Reusable_Actions.clickMethod(driver, "//*[text()='" + gender.get(i) + "']", "gender");

            //Click on Continue
            Reusable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "continue");

  Thread.sleep(10000);
  // Capture The Text
        String AmountDue = Reusable_Actions.getTextMethod(driver, "//div[@class='ledger__summary']", "Amount");
        System.out.println("This is the Amount for Subscription " + AmountDue);



    }//endof for loop

    }//end of Test 1

    @Test
            //(dependsOnMethods = {"testcase1"})
    public void testcase2() throws InterruptedException {

        // Navigate Hulu Stream
        driver.navigate().to("https://www.hulu.com");
        //click on Log in
        Reusable_Actions.clickMethod(driver,"//*[@class='navigation__login-button navigation__action-button navigation__cta']","LOGIN");
        //click on Email
        Reusable_Actions.clickMethod(driver,"//*[@id='email_id']","email click");
        // Enter Email
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='email_id']","kunsang399@gmail.com","emailid");
        //click on Email
        Reusable_Actions.clickMethod(driver,"//*[@id='password_id']","password click");
        // Enter Email
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='password_id']","kunsang532","password");
        // Click on login
        Reusable_Actions.clickMethod(driver,"//*[@data-automationid='login-button']","Login");


// Verifying the Username
        Thread.sleep(3000);
       String Username =Reusable_Actions.getTextMethod(driver,"//*[@class='navigation__login-button navigation__action-button navigation__cta']","kunsang");
       System.out.println("This is Username "+Username);

    }// end of test

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }


}// end of java class
