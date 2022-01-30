package Action_Item;

import Reusable_Libaray.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Action_Item6thweek {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest loggers;

    @BeforeSuite
    public void setDriver() {
        driver = Reusable_Actions_Loggers.setDriver();
        //Set the path for Report onces
        reports = new ExtentReports("src/main/java/Html_Report/Automation_Report.Html", true);
   //driver.manage().deleteAllCookies();
    }// end of pre-Conditions

    @Test
    public void expresstest() throws InterruptedException, IOException, BiffException, WriteException {
        loggers = reports.startTest("Express Purchase");
        //Navigate to Express
        loggers.log(LogStatus.INFO, "Navigate to the Express");

            // Read the data from Excel Sheet
            Workbook readablefile = Workbook.getWorkbook(new File("src/main/resources/Expressnew.xls"));
            // Get the Sheet from readable file
            Sheet readablesheet = readablefile.getSheet(0);
            //will return the physical rows present on the sheet
            int rowCount = readablesheet.getRows();
            System.out.println("My row count is " + rowCount);
            // Create the writeable file mimic to readable workbook
            WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Expressnew_Results.xls"), readablefile);
            WritableSheet writableSheet = writableFile.getSheet(0);

            //will return the physical rows present on the sheet
            int rowCount2 = writableSheet.getRows();
            System.out.println("My writable row count is " + rowCount2);

            //Generate the while loop
           // int i = 1;
          //  while (i < rowCount) {
        for(int i=1;i<rowCount2;i++){

                //store the SmallSize list as a variable
            String Size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + Size);
            //store the Quantity  list as a variable
            String Quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + Quantity);
            //Storing the firstname list of Variables
            String Firstname = writableSheet.getCell(2, i).getContents();
            System.out.println("My firstname are " + Firstname);
            //Storing Lastname
            String Lastname = writableSheet.getCell(3, i).getContents();
            System.out.println("My last name are " + Lastname);
            //Storing the email
            String Email = writableSheet.getCell(4, i).getContents();
            System.out.println("my email are " + Email);
            //Storing Phone Number
            String Number = writableSheet.getCell(5, i).getContents();
            System.out.println("my phone number are " + Number);
            //Storing Address
            String Address = writableSheet.getCell(6, i).getContents();
            System.out.println("my Address are " + Address);
            //Storing the Zipcodes
            String Zipcodes = writableSheet.getCell(7, i).getContents();
            System.out.println("my Zipcodes are " + Zipcodes);
            //Storing my City
            String City = writableSheet.getCell(8, i).getContents();
            System.out.println("my city are " + City);
            //Storing my States
            String State = writableSheet.getCell(9, i).getContents();
            System.out.println("my state are " + State);
            //Storing CardNumber
            String Cardnumber = writableSheet.getCell(10, i).getContents();
            System.out.println("my Cardnumber are" + Cardnumber);

                //Navigate to Express
            driver.navigate().to("https://www.express.com");

            //Verify the Title
            String actualtitle = driver.getTitle();
            if (actualtitle.equals("Express - Men's & Women's Clothing")) {
                System.out.println("this Title Matched");
            } else {
                System.out.println("Title Not matched" + actualtitle);
            }// end of Title

            //Hover on WomenTab
            Reusable_Actions_Loggers.mouseHover(driver, "//a[contains(@href,'/womens-clothing?W')]", loggers, "Women tab");

            //Click on Dress
            Reusable_Actions_Loggers.clickMethod(driver, "//a[contains(@href,'/dresses/cat')]", loggers, "Click on Dress");
            Thread.sleep(2000);
            //Scroll Down
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,650)");
            //Clicking image by Index

            Reusable_Actions_Loggers.ClickByIndex(driver,"//*[contains(@class,'_2fbIe3xmE78JEQRb26pdpQ')]",1,loggers,"Clicking on image");

            //    Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@href,'/07925982/color/Pitch Black')]", loggers, "Click on Image");
            Thread.sleep(2000);


                // Click on sizes
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='" + Size + "']",loggers,"Clicking The Sizes");
                //Click on Add Bag
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",loggers,"Click on add bag");
                //Click on View bag
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",loggers,"Click on view");
                Thread.sleep(3000);
               //  Select the Quantity by dropdown by text
                Reusable_Actions_Loggers.dropdownByText(driver,"//*[@id='qdd-0-quantity']",Quantity,loggers,"Select the Qauntity");
                //Click on Checkout
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",loggers,"Click on Checkout");
                Thread.sleep(2500);
                // Click on Guest
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",loggers,"Click on Continue the guest");
                Thread.sleep(2500);
                //input the First name
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='contact-information-firstname']",Firstname,loggers,"Firstname");
                //input the last name
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",Lastname,loggers,"lastname");
                //Input the email
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",Email,loggers,"email");
                //Input the Re- email
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",Email,loggers,"re-email");
                //Input the phone number
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",Number,loggers,"Phone Number");
                //Click on Continue
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",loggers,"Click on Continue");
                //Click on Continue
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",loggers,"Click on re Continue");
                Thread.sleep(1500);
                //Input the Address
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']",Address,loggers,"Address");
                //Input the Zipcode
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",Zipcodes,loggers,"Zipcode");
                //Input the City
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']",City,loggers,"Cities");
                //Select the State by dropdown
                Reusable_Actions_Loggers.dropdownByText(driver,"//*[@name='shipping.state']",State,loggers,"States");
                //Click on continue
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",loggers,"Click on Continue");
                //Click on continue
                Reusable_Actions_Loggers.clickMethod(driver,"//span[text()='Continue']",loggers," continue" );
                //Input the card number
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='creditCardNumberInput']",Cardnumber,loggers,"card number");
                //Click on place order
              //  Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",loggers,"click on place oder ");
                // Capture the error text from payment
                String TextMessage = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@class='_18MKSBxx labelError']",loggers,"Capturing the text ");

                System.out.println("This is my my Error message "+ TextMessage);

                // storing the values to the writable excel sheet
                 Label label = new Label(11,i,TextMessage);
                //I need to write back to the writable sheet
               writableSheet.addCell(label);

               driver.manage().deleteAllCookies();

                //increment
               // i = i + 1;
        }// end of loop
     // writing back to the writable file to see
        writableFile.write();
        writableFile.close();
        reports.endTest(loggers);

        }//end of Test
    @AfterSuite
    public void endTest(){
        driver.quit();
        //write/log the informations back to the html report
        reports.flush();
    }//end of after suite


}//end of java class
