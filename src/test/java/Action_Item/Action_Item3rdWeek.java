package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class Action_Item3rdWeek {
    public static void main(String[] args) throws InterruptedException {

//set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
         options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();
// declare the String variable
        String[]Sports=new String[6];
        Sports[0]="Football";
        Sports[1]="Soccer";
        Sports[2]="Table Tennis";
        Sports[3]="Boxing";
        Sports[4]="UFC";
       Sports[5]="Cricket";

        // By using For loop
        for (int i=0;i<Sports.length;i++){
           // simply open Bing.com
            driver.navigate().to("https://bing.com");

            // Maximize the Screen
          //  driver.manage().window().fullscreen();

            Thread.sleep(2000);

            // Search for different location

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Sports[i]);

             // Click on Search box
            driver.findElement(By.xpath("//*[@id='search_icon']")).click();

               Thread.sleep(2000);
              // capture the search Result
           String SearchResult= driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            // Split the number and get the search number

           String [] ArrayResult = SearchResult.split(" ");
            // print the search result

           System.out.println("This is Sports search Result"+" "+ ArrayResult[0]);

        }//end of loop
        driver.quit();

    }// end of main method
}//end of Java class
