package com.example.javarealcodes;
import java.util.Scanner;
public class resistanceformax2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                      \uD83D\uDE4F WELCOME  \uD83D\uDE4F");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("              EQUIVALENT RESISTOR CALCULATOR "); // main heading
        System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        Scanner permit = new Scanner(System.in);
        System.out.println("                    * INSTRUCTIONS         ");
        System.out.println("• IT IS PROGRAMMED TO CALCULATE ONLY MAXIMUM 6 RESISTOR");
        System.out.println("• TOTAL NUMBER OF RESISTANCE SHOULD NOT EXCEED 6 ");
        System.out.println("----------------------------------------------------------------------");


// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        System.out.print("TOTAL NUMBER OF RESISTANCE  = ");
        int CT = permit.nextInt();
        System.out.println("----------------------------------------------------------------------");



// --------------------------------------------------------------------------------------------------------------------------------------------------------------



        if (CT == 1) {
            System.out.print("ENTER VALUE OF RESISTOR = ");
            float c11 = permit.nextFloat();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("• EQUIVALENT RESISTANCE = " + c11);
        }




// --------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (CT == 2) {
            System.out.print("ENTER VALUE OF 1ST RESISTOR = ");
            float c21 = permit.nextFloat();
            System.out.print("ENTER VALUE OF 2ND RESISTOR = ");
            float c22 = permit.nextFloat();
            System.out.print("----------------------------------------------------------------------");
            System.out.println(

            );
            System.out.print("NUMBER OF PACKET OF SERIES = ");
            int cs2 = permit.nextInt();// combination in parallel = sp2
            System.out.print("NUMBER OF PACKET OF PARALLEL = ");
            int cp2 = permit.nextInt();// combination in series = cs2
            System.out.println("----------------------------------------------------------------------");

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

            if (cs2 == 1 && cp2==0) {
                float sum = c21+c22;

                System.out.println("•EQUIVALENT RESISTANCE = " + sum);}

            if (cp2 == 1 && cs2==0) {
                float sump2 = (c21 * c22) / (c21 + c22);
                System.out.println("•EQUIVALENT RESISTANCE = " + sump2);}
        }
// --------------------------------------------------------------------------------------------------------------------------------------------------------------

    }
}

// completed
