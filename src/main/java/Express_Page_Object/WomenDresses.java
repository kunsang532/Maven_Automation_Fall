package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenDresses extends Resuable_Annotations {
    ExtentTest logger;
    public WomenDresses(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }// end of Constructor method
    // Define web element we need for this page
    @FindBy(xpath = "//*[@class='JOmERbbC974crOskZ2A3DA==']")
    WebElement ClickImage;
    public void ClikonImage(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickImage,logger,"Image");
    }


}//end of class
