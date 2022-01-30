package Action_Item;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;

        import java.util.ArrayList;
        import java.util.List;

public class Action_Item4rdWeek {
    public static void main(String[] args) throws InterruptedException {

        // Declare Variable String
        ArrayList<String>Zipcodes=new ArrayList<>();
        Zipcodes.add("11218");
        Zipcodes.add("10075");
        Zipcodes.add("10078");
        // Using For loop
        for (int i=0;i<Zipcodes.size();i++) {
            // call Webdrivermanager
            WebDriverManager.chromedriver().setup();
            // Declare ChromeOptions
            ChromeOptions options = new ChromeOptions();
            // Sets for Incognito mode and Maximize the screeen
            options.addArguments("incognito");
            // options.addArguments("Start-Maximized");"Using MAc"
            //Set the Chromedriver
            WebDriver driver = new ChromeDriver(options);
            // Navigate to WeightWatcher.com.
            driver.navigate().to("https://www.weightwatchers.com");

            Thread.sleep(2000);
            //Click on Attend
            try {
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click the Attend" + e);
            }
            Thread.sleep(2000);
            // Select the Unlimited Workshops
            try {
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on dropdown" + e);
            }// end of click dropdown exception
            Thread.sleep(2000);
            // click on Studio Link
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Studio link" + e);
            }
            // Enter the Location box
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).click();
            } catch (Exception e) {
                System.out.println(" Unable to Enter the Location box" + e);
            }
// Input the Zipcode
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(Zipcodes.get(i));

            } catch (Exception e) {
                System.out.println(" Unable to Input the Zipcode " + e);
            }
            Thread.sleep(2000);
// Click on Search Button
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Search button" + e);
            }
            Thread.sleep(2000);

            //  Storing Web Element Variable
            try {
                List<WebElement> myList = driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]"));
                if (i == 0) {
                    myList.get(0).click();
                    System.out.println("if i is 0 then click on first link");
                }
                if (i == 1) {
                    myList.get(1).click();
                    System.out.println("if i is 1 then click on Second link");
                }
                if (i == 2) {
                    myList.get(2).click();
                    System.out.println("if i is 2 click on Third link");
                }
            } catch (Exception e) {
                System.out.println("Unable to link" + e);
            }// end of condition
            Thread.sleep(5000);

            // Capture the Address

            try {

                String Address = new String();
                Address = driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']")).getText();
                System.out.println(Address);
            } catch (Exception e)
            {System.out.println("Unable to capture the Address "+e);}

           // Scroll down by using (JAva Script) .
           try {
               JavascriptExecutor jse = (JavascriptExecutor) driver;
               jse.executeScript("scroll(0,450)");
           }catch (Exception e)
           {System.out.println("Unable to Scroll down "+e);}

           //Capture the Table and Print IT
               try {
                   String VirtualStudio = new String();
                   VirtualStudio = driver.findElement(By.xpath("//*[@class='workshopSchedule-2foP8']")).getText();
                   System.out.println(VirtualStudio);
               }catch (Exception e)
               {System.out.println("unable to capture the table and print it");}



        }// end of for loop


    }//end of main method
}//end java class
