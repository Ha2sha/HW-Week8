package homework8;
/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.*/

import java.util.Scanner;

public class P13SharedDigit {
    public static boolean hasSharedDigit(int x,int y){
        if((x <=10 || x >=99) && (y <=10 || y >=99)) {
            return false;
        }

        int xFirstDigit = x/10;//checks 1st digit of x
        int yFirstDigit = y/10;//checks 1st digit of y
        int xLastDigit = x%10;//checks last digit of x
        int yLastDigit = y%10;//checks last digit of y

        if(xFirstDigit == yFirstDigit || xFirstDigit == yLastDigit || xLastDigit  == yLastDigit||xLastDigit==yFirstDigit)
        {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created object of scanner class
        System.out.println("Enter 1st number: ");
        int a = scr.nextInt();//reads user input from console
        System.out.println("Enter 2nd number: ");
        int b = scr.nextInt();//reads user input from console
        System.out.println(hasSharedDigit(a,b));//calling static method

        scr.close();//close scanner object
    }
}
