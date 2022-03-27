package homework8;

import java.util.Scanner;

//Write a program in Java to display the pattern like a triangle with a number.
public class P06NumberTriangle {
    public static void numTriangle(int n) {

        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(j + 1);//
            }
            System.out.println("");//new line
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        numTriangle(scr.nextInt());//calls static method

    }
}
