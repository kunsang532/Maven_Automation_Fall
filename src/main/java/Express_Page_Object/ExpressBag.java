package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class ExpressBag extends Resuable_Annotations {
    ExtentTest logger;
    public ExpressBag(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }//end of constructor method

    //Define the Driver
    @FindBy(xpath = "//*[@id='qdd-0-quantity']")
    WebElement SelectQuantity;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement GuestCheckout;


    public void quantity(String userData){
        Reusable_Actions_Loggers_POM.dropdownByText(driver,SelectQuantity,userData,logger,"Quantity");
    }// end of Quantity method

    public void ClickonCheckout(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Checkout,logger,"click on checkout");
    }//end of checkout method

    public void ClickonGuestCheckout(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,GuestCheckout,logger,"Click on Guest checkout");
    }


}//end of java class
