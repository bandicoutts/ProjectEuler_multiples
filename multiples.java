/* If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000. */

import java.util.Scanner;
import java.util.*;
import java.util.Random;


class multiples {


    private static int getRange(){
        String result;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a number to sum values up to:");
        try {
            return r.nextInt();
        } catch (InputMismatchException e){
            int random = (int)(Math.random() * 1000);
            System.out.println("That's not a valid number. We'll just do this with the number " + random);
            return random;
        }
    }

    private static void doSum(int range){
        int result = 0;

        for (int i = 0; i < range; i++){
            if (i % 3 == 0){
                result += i;
            } else if (i % 5 == 0) {
                result += i;
            }
        }

        System.out.println(result);

    }


    public static void main(String[] args){
        doSum(getRange());
    }

}