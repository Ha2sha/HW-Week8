package homework8;

import java.util.Scanner;

//Even Digit Sum
public class P11EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        //checks negative number
        if (number < 0) {
            return -1;
        }
        // declare variables
        int lastDigit = 0;
        int evenDigitSum = 0;

        // loop to repeat the process
        while (number != 0) {
            lastDigit = number % 10;// find last digit
            if (lastDigit % 2 == 0)// check last digit even?
            {
                evenDigitSum += lastDigit; // add it to sum
            }
            number = number / 10; // remove last digit of number
        }
        return evenDigitSum; // return sum value
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scr.nextInt();
        int result = getEvenDigitSum(a);
        System.out.println("The sum of even digits is: " + result);//called static method

        scr.close(); // close Scanner class object
    }
}
