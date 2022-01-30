package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ImplictWait_UPS {
    public static void main(String[] args) throws InterruptedException {
        // Set up the Chrome driver
        WebDriverManager.chromedriver().setup();
        //Declare and define chrome option
        ChromeOptions options = new ChromeOptions();
        // declare the all arguments
      //  options.addArguments("headless");
        options.addArguments("incognito");
        options.addArguments("start-fullscreen");
      //  options.addArguments("Start-maximized");
        // declare chromedriver
        ChromeDriver driver =new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //navigate to usps
        driver.navigate().to("https://www.ups.com/us/en/Home.page");
        //Thread.sleep(2000);
        //click on Track
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();



    }// end of main method
}// end of java class
