package homework8;

import java.util.Scanner;
/*Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.*/

public class P02MinAndMaxInputChallenge {

    public static void maxMin() {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        //endless while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean isValidNum = scanner.hasNextInt(); //checks if user enters int type data
            //if body executes until true
            if (isValidNum) {
                int number = scanner.nextInt();
                if ((number > minNum && number > maxNum) && (minNum == 0 && maxNum == 0)) {
                    maxNum = number;
                }else if ((number > minNum && number > maxNum) && (minNum == 0 && maxNum != 0)) {
                    minNum = maxNum;
                    maxNum = number;
                } else if (number > minNum && number > maxNum) {
                    maxNum = number;
                } else if (((number < maxNum) && (minNum == 0)) || (number <= minNum)) {
                    minNum = number;
                }
            } else //when user enters alphabet or symbols as input
            {
                break;
            }
        }
        System.out.println("Min value is " + minNum + " and Max value is: " + maxNum);
        scanner.close();
    }

    public static void main(String[] args) {
        maxMin();
    }
}

