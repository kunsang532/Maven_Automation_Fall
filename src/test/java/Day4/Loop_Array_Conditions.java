package Day4;

public class Loop_Array_Conditions {
    public static void main(String[] args) {
        // create a dynamic array for 4 different cities ,Iterate through the values but only print when city is
        //either brooklyn or queens
        String [] cities = new String[4];
        cities[0]= "Queens";
        cities[1]="Manhattan";
        cities[2]="Bronx";
        cities[3]="Brooklyn";

        for(int i=0; i<cities.length; i++){
            //two if condition
            if (cities[i] == "Brooklyn") {
                System.out.println("City is " + cities[i]);
            } else if (cities[i] == "Queens") {
                System.out.println("City is " + cities[i]);
            }
        }// end of condition
    }// end of main method
}//end of java class
