package Day14;

import Express_Page_Object.BaseClass;
import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_PageObject extends Resuable_Annotations {
    @Test
    public void Express_Checkout() throws IOException, BiffException, InterruptedException, WriteException {
        // navigate to Express
        logger.log(LogStatus.INFO,"Navigate to Express");
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
        for(int i=1;i<rowCount2;i++) {

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
            // Navigate to Express
            driver.navigate().to("https://www.express.com");
            //Verify the Title
            String actualtitle = driver.getTitle();
            if (actualtitle.equals("Express - Men's & Women's Clothing")) {
                System.out.println("this Title Matched");
            } else {
                System.out.println("Title Not matched" + actualtitle);
            }// end of Title
            //Hover Women Tab
            BaseClass.expressHomepage().HovertoWomenTab();
            //Click on Dress
            BaseClass.expressHomepage().ClickonDress();
            //Scroll Down
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,650)");

            // Click on Dress
            BaseClass.womenDresses().ClikonImage();

            //Select the Sizes
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='" + Size + "']",logger,"Clicking The Sizes");
           // BaseClass.selectSize().Sizes(Size);
            //Click on Add bag
            BaseClass.selectSize().AddBAg();

            //Click on View Bag
            BaseClass.selectSize().ViewBag();

            //Scroll Down
            JavascriptExecutor jsse = (JavascriptExecutor) driver;
            jsse.executeScript("scroll(0,150)");

            //Select the Dropdown
            BaseClass.expressBag().quantity(Quantity);

            //Click on Checkout
            BaseClass.expressBag().ClickonCheckout();

            //Click on Guest Checkout
            BaseClass.expressBag().ClickonGuestCheckout();

            //Input First Name
            BaseClass.checkOut().FirstName(Firstname);

            //Input  Last Name
            BaseClass.checkOut().LastName(Lastname);

            //Input  Email
            BaseClass.checkOut().Email(Email);

            //Input  Confirmed Email
            BaseClass.checkOut().Confirmedemail(Email);

            //Input  Number
            BaseClass.checkOut().PhoneNumber(Number);

            //Click on Continue
            BaseClass.checkOut().Continue();

            Thread.sleep(2000);

            //Input Address
            BaseClass.checkOut().Address(Address);

            //Input Zipcode
            BaseClass.checkOut().Zipcode(Zipcodes);

            //Input City
            BaseClass.checkOut().City(City);

            //Input State
            BaseClass.checkOut().State(State);

            //click on continue
            BaseClass.checkOut().Continue();

            //Click on Continue
            BaseClass.delivery().Continuee();

            //Input credit Card Number
             BaseClass.payment().CreditNumber(Cardnumber);

             // click on place order
            BaseClass.payment().PlaceOrder();

            // Capture the error text from payment
            String TextMessage = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@class='_18MKSBxx labelError']",logger,"Capturing the text ");

            System.out.println("This is my my Error message "+ TextMessage);

            // storing the values to the writable excel sheet
            Label label = new Label(11,i,TextMessage);
            //I need to write back to the writable sheet
            writableSheet.addCell(label);

            driver.manage().deleteAllCookies();

        }//end of loop
        // writing back to the writable file to see
        writableFile.write();
        writableFile.close();
        reports.endTest(logger);
    }//end of test
    @AfterSuite
    public void endTest(){
        driver.quit();
        //write/log the informations back to the html report
        reports.flush();
    }//end of after suite

}// end of java class
