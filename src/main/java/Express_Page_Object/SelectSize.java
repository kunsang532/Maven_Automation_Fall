package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import Reusable_Libaray.Reusable_Actions_Loggers_POM;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectSize extends Resuable_Annotations {
    ExtentTest logger;
    public SelectSize(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=Resuable_Annotations.logger;
    }//end of constructor method

    //Define the Driver

   // @FindBy(xpath = "//*[text()='" + Size + "'])
    WebElement Sizes;
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddBag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;

   /*public void Sizes(String sizes){
      //  Reusable_Actions_Loggers_POM.dropdownByText(driver,Sizes,sizes,logger,"Sizes");
  }*/
    public void AddBAg(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddBag,logger,"Add Bag");
    }// end of Add bag method
    public void ViewBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View Bag");
    }//end of view bag method




}//end of class
