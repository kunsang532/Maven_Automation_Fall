package Partcise_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saks_FifthAvenue {
    public static void main(String[] args) {

//set up the property of chromedriver
 System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
//Declare and Define Chromeoption
        ChromeOptions options=new ChromeOptions();
        // Add Arguments as you need
        // Add incognito Mode
        options.addArguments("incognito");
        //Maximize your browser
        options.addArguments("Start-Maximized");
        //Sets as a Headless
        options.addArguments("headless");
// declare and define web driver
        WebDriver driver=new ChromeDriver();
        // Declare the variable String
        String[]Saks=new String[3];
        Saks[0]="Shirt";
        Saks[1]="Pants";
        Saks[2]="Coat";
        // By using for loop
        for(int i=0;i<Saks.length;i++);
        // Navigate to google
        driver.navigate().to("https://www.Allsaint.com");
        //Search on Saks
     //  driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Saks[0]);
        // click on Summit
      //  driver.findElement(By.xpath(""))





    }//end of main method
}//end of java class
