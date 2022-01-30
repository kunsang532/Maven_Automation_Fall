package Day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.sql.DriverManager;

public class Mortgage_Cal_Scroll {
    public static void main(String[] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();

        //Declare Chrome options
        ChromeOptions options= new ChromeOptions();

        // Maximize Window
        options.addArguments("start-maximized");

        // Set the Driver
        WebDriver driver=new ChromeDriver(options);

        //Navigate to Mortgage Calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");

        Thread.sleep(1300);

       // Scroll down the window to view Loan (java Scrip)

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,450)");

    }//end of main method

}// Java class
