package Express_Page_Object;

import Reusable_Libaray.Resuable_Annotations;
import USPS_Page_Object.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Resuable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor method

    //create static reference for Express home page
    public static ExpressHomepage expressHomepage(){
        ExpressHomepage expressHomepage = new ExpressHomepage(driver);
        return  expressHomepage;
    }
    //create static reference for WomenDress
    public static WomenDresses womenDresses(){
        WomenDresses womenDresses=new WomenDresses(driver);
        return womenDresses;
    }
    // create static reference for Select Size
    public static SelectSize selectSize(){
        SelectSize selectSize=new SelectSize(driver);
        return selectSize;
    }
    //create static reference for Express Bag
    public static ExpressBag expressBag(){
        ExpressBag expressBag=new ExpressBag(driver);
        return expressBag;
    }
    //create static reference for Checkout
    public static CheckOut checkOut(){
        CheckOut checkOut=new CheckOut(driver);
        return checkOut;
    }
    //create static reference for Delivery Options
    public static Delivery delivery(){
        Delivery delivery= new Delivery(driver);
        return delivery;
    }

    //Create static reference for Payment
    public static Payment payment(){
        Payment payment=new Payment(driver);
        return payment;
    }

}//end of java class
