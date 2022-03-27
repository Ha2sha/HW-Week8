package homework8;

import java.util.Scanner;

//To check if number is Palindrome Number or not
public class P05PalindromeNumber {
    public static boolean isPalindrome(int number) {
        //converts negative number to positive number
        if(number<0){
            number=-number;
        }
        int lastDigit, reverse = 0, temp;
        temp = number;
        while (number > 0) {
            lastDigit = number % 10;//Stores the last digit
            reverse = reverse * 10 + lastDigit;//Increases the place value of reverse by one and adds lastDigit
            number = number / 10;//removes the last digit of num.
        }
        if (reverse == temp) //checks if both are equal
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scr.nextInt();
        boolean check = isPalindrome(a);
        //checks number is Palindrome or not
        if (check)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");

    }
}
