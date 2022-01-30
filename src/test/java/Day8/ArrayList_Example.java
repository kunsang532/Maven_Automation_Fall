package Day8;

import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
// declare String Variable
        ArrayList<String>cities= new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("Queens");
        // print only Brooklyn
        System.out.println("This is my city)"+cities.get(0));
// declare Integer Variable
        ArrayList<Integer>streetnumber= new ArrayList<>();
       streetnumber.add(255);
       streetnumber.add(355);
       streetnumber.add(455);

       // print Manhattan and streetnumber 355
        System.out.println(("This is my city")+cities.get(1)+("this is my streetnumber ")+streetnumber.get(1));




    }//end of main method
}//end of java class
