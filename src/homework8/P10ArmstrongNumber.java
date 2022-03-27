package homework8;
/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

import java.util.Scanner;

public class P10ArmstrongNumber {
    public static void isArmstrong(int num) {
        int number, temp, total = 0;
        number = num;
        while (num != 0) {
            temp = num % 10;//assign last digit
            total = total + temp * temp * temp; //cube of temp & added to total
            num /= 10;//removes the last digit of num
        }
        if (total == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scr.nextInt();
        isArmstrong(a);//called static method
    }
}
