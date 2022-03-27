package homework8;
/*Write a program in Java to display the pattern like a diamond.
While loop*/

import java.util.Scanner;

public class P14DimondPattern {
    public static void isDimond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created object of scanner class
        System.out.println("Input number of rows (half of the diamond): ");
        int a = scr.nextInt();//reads user input from console
        System.out.print("Enter Symbol : ");
        char c = scr.next().charAt(0);

        isDimond(a,c);//called static method
        scr.close();//closed scanner object
    }
}
