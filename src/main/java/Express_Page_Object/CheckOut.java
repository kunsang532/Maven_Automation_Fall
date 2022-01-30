package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends Resuable_Annotations {
    ExtentTest logger;
    public CheckOut(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }//end of constructor method

    //Define the WebElement
    @FindBy(xpath = "//*[@id='contact-information-firstname']")
    WebElement Firstname;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement Lastname;
    @FindBy(xpath = "//*[@name='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement ConfirmedEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement PhoneNumber;
    @FindBy(xpath = "//span[text()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement Address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement Zipcode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;



public void FirstName(String firstname){
    Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Firstname,firstname,logger,"First Name");
}//end of Firstname method

    public void LastName(String lastname) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Lastname, lastname, logger, "Last Name");
    }//end of lastname method

    public void Email (String email) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Email, email, logger, "Email");
    }// end of email method

    public void Confirmedemail(String confirmedemail) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, ConfirmedEmail, confirmedemail, logger, "Confirmed Email");
    }//end of confirmed email

    public void PhoneNumber(String phone){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, PhoneNumber, phone, logger, "Phone Number");
    }// end of phone number method

    public void Continue(){
    Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger," Click on Continue");
    }// end of continue method

    public void Address(String address) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Address, address, logger, "Address");
    }//end of Address method

    public void Zipcode(String zipcode) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Zipcode, zipcode, logger, "Zipcode");
    }//end of Zipcode method

    public void City(String city) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, City, city, logger, "City");
    }//end of City method

    public void State( String state) {
        Reusable_Actions_Loggers_POM.dropdownByText(driver, State, state, logger, "State");
    }// end of state method



}//end of class
