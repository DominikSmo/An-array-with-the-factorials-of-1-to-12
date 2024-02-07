import java.math.BigInteger;
import java.util.Arrays;


public class Factorialexercise1 {

    public static void main(String[] args) {

        exercise();


    }

    public static void exercise() {
        int[] factorials = new int[12];
        Factorial(factorials);

    }

    public static int[] Factorial(int[] factorials) {
        // Create a program which computes the factorial of the numbers from one to twelve and put them in an array.
        int[] tab = new int[factorials.length];


        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;                                     // Here we are filling up an array with integers for which a program will compute the factorial
            if (i > 0) {
                factorials[i] = factorials[i - 1] * tab[i];     //Here we fill an array with factorials of the numbers from a 'tab' array for indices from 1 to 11 (from i = 1)

            } else {

                factorials[i] = tab[i];                         // Here an index equaled 0 is filled up with appropriated value(for i = 0)
            }
        }

            System.out.println("tab: " + Arrays.toString(tab));
            System.out.println("Array with factorials: " + Arrays.toString(factorials));  //Displaying and array with the factorial of the numbers from 1 to 12
            return factorials;
        }
    }


