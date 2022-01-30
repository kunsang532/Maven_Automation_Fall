package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delivery extends Resuable_Annotations {
    ExtentTest logger;
    public Delivery(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }//end of constructor method

    //Define Web Element
    @FindBy(xpath ="//span[text()='Continue']")
    WebElement Continuee;

    public void Continuee(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continuee,logger,"Continue");
    }



}// end of class


