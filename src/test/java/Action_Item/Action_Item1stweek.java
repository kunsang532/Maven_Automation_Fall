package Action_Item;

public class Action_Item1stweek {
    public static void main(String[] args) {
        //declare Zipcode variable String[] zipcode;
        //declare Streetnumber variable int[] streetnumber;

        String zipcode[];
        zipcode = new String[4];

        zipcode[0] ="11230";
        zipcode[1] ="11218";
        zipcode[2] ="11219";
        zipcode[3] ="11220";

        int streetNumber[];
        streetNumber = new int[4];
        streetNumber[0] = 45;
        streetNumber[1] = 56;
        streetNumber[2] = 67;
        streetNumber[3] = 78;

        for(int i=0; i<4; i++) {
            System.out.println("my zip code is: " + zipcode[i] + "and my state number is : " + streetNumber[i]);
        }
        }// end of main method
    }// end of java class
