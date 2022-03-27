package homework8;

import java.util.Scanner;
//Read 10 numbers from the console entered by the user and print the sum of those numbers
public class P01ReadingUserInputChallenge {
    public static void nextInt() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        System.out.println("__________________");
        int counter = 1;
        int sum = 0;
        do {
            System.out.print("\nEnter NO#:" + counter + " : ");
            //if user inputs value which is not an Integer
            while (!scr.hasNextInt()) {
                scr.next(); // this is important! reads input from console which is not Integer type
                System.out.println("Invalid number!");
                System.out.print("\nEnter NO #" + counter + " : ");
            }
            sum = sum + scr.nextInt();//reads user input & add it to sum
            counter++;//increase counter by 1
        } while (counter <= 10);//when counter is 11 exits the loop
        System.out.println("The Sum is: " + sum);//prints the sum of 10 numbers
        scr.close();//close the scanner
    }

    public static void main(String[] args) {
        nextInt();
    }
}

