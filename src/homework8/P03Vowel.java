package homework8;

import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
 */
public class P03Vowel {
    public static void isVowel() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String s1 = scr.next();
        scr.close();//closes the scanner

        //checks length of String
        if (s1.length() > 1) {
            System.out.println("not valid length");
        } else {
            char ch = s1.charAt(0);
            //conditions is true when user enters alphabets in uppercase or lowercase
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'A')) {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(ch + " is  a Vowel");
                        break;
                    default:
                        System.out.println(ch + " is a Consonant");
                }
            } else if (ch >= 0 && ch <= 9)//if user enters any number as input or more than 1 character
                System.out.println("Invalid input1");
            else //if user enter any symbol as input
                System.out.println("Invalid Input3");
        }
    }
    public static void main(String[] args) {
        isVowel();//calling static method directly
    }
}
