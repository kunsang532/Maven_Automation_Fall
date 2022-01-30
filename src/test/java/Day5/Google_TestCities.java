package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_TestCities {
    public static void main(String[] args) throws InterruptedException {

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

// Declare the variable String
        String [] cities = new String[4];
        cities[0]= "Queens";
        cities[1]="Manhattan";
        cities[2]="Bronx";
        cities[3]="Brooklyn";

        for(int i=0; i<cities.length; i++) {
            //simply open the google web site
            driver.navigate().to("https://www.google.com");

            //maximize my browser
            //driver.manage().window().fullscreen(); //for mac
            driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

           //hit submit on google search button
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
            ;

            // Another wait Statement since we came  to a new page ( result page)
            Thread.sleep(3000);

            // capture the search result and store it as a variable
            //capture the search result but only print out the search number
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //split and extract out the search number
         String[] arrayResults = searchResult.split(" ");
            //print the search number
         System.out.println("The  search number is " + arrayResults[1]);
        }// end of loop
           //quit will be define outside of loop you are quitting only once at the end
            driver.quit();

        }//end of main method
    }// end of java class
