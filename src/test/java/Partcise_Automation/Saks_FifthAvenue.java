package Partcise_Automation;

import Reusable_Libaray.Resuable_Annotations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Saks_FifthAvenue extends Resuable_Annotations {
    @Test
    public static void main(String[] args) {

        // Initialized boolean variables a1 and b1
        String  ActualTittle="kunsang";
        String  ExpectedTittle="kunsang";
          boolean b1=false;
          boolean b2=true;

        // if the condition matches then a1 will print
       //  if(ActualTittle==ExpectedTittle){System.out.println(b2);}
      //   else{System.out.println(b1);}



        //    String ActualTittle="Kunsang";
        //    String ExpectedTittle="Kunsang";
            Assert.assertEquals(ActualTittle,ExpectedTittle);




    }//end of main method



}//end of java class
