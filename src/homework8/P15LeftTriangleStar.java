package homework8;
//Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class P15LeftTriangleStar {

    public static void leftTriangle(int x) {
        int i, j;
        // do for each row
        for (i = 1; i <= x; i++) {
            // print '*' i times
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to the next line
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created object of scanner class
        System.out.println("Enter number of rows: ");
        int a = scr.nextInt();//reads user input from console
        leftTriangle(a);//called static method
        scr.close();//closed object of scanner
    }

}
