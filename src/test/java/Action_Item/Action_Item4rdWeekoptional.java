package Action_Item;

import Day8.ArrayList_Example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Action_Item4rdWeekoptional {
    public static void main(String[] args) throws InterruptedException {
        //Declare Array variables
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("10075");
        zipcode.add("11230");

        //Declare Array variables
       ArrayList<Integer>miles = new ArrayList<>();
       miles.add(300);
       miles.add(400);
       miles.add(500);

        //Iterate by Using For loop

           // Set up WebDriver Manager
           WebDriverManager.chromedriver().setup();
           //Declare Chrome option
           ChromeOptions options = new ChromeOptions();
           // options.addArguments("headless");
           options.addArguments("incognito");
           options.addArguments("start-maximized");
           //Declare Chromedriver
           ChromeDriver driver = new ChromeDriver(options);
           //Navigate to Aetna Homepage
           driver.navigate().to("https://www.aetna.com");
           Thread.sleep(2000);

           //Verify the Homepage tittle is Health Insurance Plans Aetna
           driver.getTitle().contains("Health Insurance Plans Aetna");
           String actualTitle = driver.getTitle();
           System.out.println(actualTitle);

           //Click on Shop for a plan
           try {
               driver.findElement(By.xpath("//*[text()='Shop for a plan']")).click();
           } catch (Exception e) {
               System.out.println("Unable to click " + e);

           }
           //Click on Medicare link
           try {
               driver.findElement(By.xpath("//*[text()='Medicare']")).click();
           } catch (Exception e) {
               System.out.println("Unable to click " + e);
           }
           Thread.sleep(1200);
           //Click on find doctor link
           try {
               driver.findElement(By.xpath("//*[contains(@data-analytics-name,'Find a doctor')]")).click();
           } catch (Exception e) {
               System.out.println("Unable to click on link " + e);
           }
           Thread.sleep(2500);
           // Click on 2021 Medicare plans you purchase yourself
           try {
               driver.findElement(By.xpath("//*[@class='primaryPurple BtnWidth mgbutton w400']")).click();
           } catch (Exception e) {
               System.out.println("Unable to click " + e);
           }
           Thread.sleep(2500);

           // Click on Zipcode
           try {
               driver.findElement(By.xpath("//*[@class='form-group col-lg-12 pad0']")).click();
           } catch (Exception e) {
               System.out.println("Unable to click " + e);
           }
           Thread.sleep(1200);
            //Iterate by Using For loop
            for (int i = 0; i <miles.size(); i++) {
                //Input the zipcode
                try {
                    driver.findElement(By.xpath("//*[@id='medZip']")).sendKeys(zipcode.get(i));
                } catch (Exception e) {
                    System.out.println("Unable to input Zipcode" + e);
                }
            }//end opf loop
            Thread.sleep(1200);

           //Click on Dropdown
            try {
                driver.findElement(By.xpath("//*[@ng-bind-html='match.label | uibTypeaheadHighlight:query']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click " + e);
            }
            Thread.sleep(2000);

            // Reset the Slider to zero
            try {
                WebElement slider = driver.findElement(By.xpath("//*[@ng-style='minPointerStyle']"));
                Actions actions = new Actions(driver);
                Thread.sleep(1000);
                slider.click();
                //to reset the slider to zero since slider defaulted to 25 all the time

                for (int i=0; i <25; i++) {
                    actions.sendKeys(Keys.ARROW_LEFT).build().perform();

                }//end of loop 1

                Thread.sleep(400);

//desired range so new loop is set
                for (int i = 0; i < miles.get(i); i++) {
                    actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
                }//end of loop 2

            } catch (Exception e) {
                System.out.println("Unable to move the slider" + e);
            } // end of slider
            //end of loop 2

        }//end of main method
    }//end of java class
