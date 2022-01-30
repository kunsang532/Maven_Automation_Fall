package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_UPS {
    public static void main(String[] args) throws InterruptedException {

        //Set the Chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);
        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }
/*
        //declare mouse actions
        Actions mouseAction = new Actions(driver);
        // Hover to Send tab to the drop down
        try {
            WebElement Sendtab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(Sendtab).perform();
        }catch (Exception e){
            System.out.println("unable to hover "+e);
        }

 */
      // Reusable_Actions.Mousehover(driver,("//*[text()='Send']"),"Sendtab");
       Reusable_Actions.clickMethod(driver,("//*[text()='Look Up a ZIP Code']"),"Zipcode");
        //Click on Zipcode
     /*   try {
            WebElement Zipcode =driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            .moveToElement(Zipcode).click().perform();

        }catch (Exception e){
            System.out.println("unable to click on drop down"+e);
        }

*/




    }//end of main method
}//end of java class
