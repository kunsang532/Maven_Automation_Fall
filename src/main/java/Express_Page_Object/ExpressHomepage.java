package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressHomepage extends Resuable_Annotations {
    ExtentTest logger;

    public ExpressHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Resuable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//a[contains(@href,'/womens-clothing?W')]")
    WebElement WomenTab;
    @FindBy(xpath = "//a[contains(@href,'/dresses/cat')]")
    WebElement Dresses;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;

    public void HovertoWomenTab(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,WomenTab,logger,"Women Tab");

    }//end of method 1
    public void ClickonDress(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Dresses,logger,"Dress");
    }



// end of method
}//end of class



