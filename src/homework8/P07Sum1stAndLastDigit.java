package homework8;

import java.util.Scanner;

//First And Last Digit Sum
public class P07Sum1stAndLastDigit {

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int r, rev = 0, fd, ld, s;
        ld = number % 10;
        //reverse the number to find first digit
        while(number>0){
            r = number % 10;//stores the last digit(remainder)
            rev = rev * 10 + r;//Increases the place value of reverse by one and adds remainder
            number = number / 10;//removes the last digit of num
        }
        fd=rev%10;
        s=fd+ld;
        return s;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a=scr.nextInt();
        System.out.println("The sum of first & last digit is: "+sumFirstAndLastDigit(a));
    }
}
