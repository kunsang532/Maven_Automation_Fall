package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends Resuable_Annotations {
    ExtentTest logger;
    public Payment(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }// end of Constructor method
    @FindBy(xpath = "//*[@id='creditCardNumberInput']")
    WebElement CreditCard;
    @FindBy(xpath ="//*[@class='_18MKSBxx labelError']")
    WebElement ErrorMessage;
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement PlaceOrder;
    public void CreditNumber(String creditnumber) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, CreditCard, creditnumber, logger, "First Name");
    }//end of credit number
    public void PlaceOrder(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,PlaceOrder,logger,"place oder");
    }//end of place Order method



}//end of class
