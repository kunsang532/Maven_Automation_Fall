package Day2;

public class DynamicArray {

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


        System.out.println("My zipcode is "+zipcode[0]+" "+"and my streetnumber is"+" "+streetNumber[0]);
        System.out.println(" My zipcode is " + zipcode[1]+" "+ "and mystreetnumber is "+ streetNumber[1]);

    }//end of main method
}//end of java class


