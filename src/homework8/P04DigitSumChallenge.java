package homework8;

import java.util.Scanner;

public class P04DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number >= 10) {
            int digit, sum=0;
            while (number > 0) {
                //finds the last digit of the given number
                digit = number % 10; //if user input=25 digit=5,2
                //adds last digit to the variable sum
                sum = sum + digit;//5,7
                //removes the last digit from the number
                number = number / 10;//2,0
            }
            return sum;
        } else {
            return -1;//return -1 for negative numbers & one digit number
        }
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number>=2 digits: ");
        int result=sumDigits(scr.nextInt());
        System.out.println("Sum of number digits is: "+ result);
    }
}
