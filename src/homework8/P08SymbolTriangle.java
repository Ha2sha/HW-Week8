package homework8;

import java.util.Scanner;

public class P08SymbolTriangle {
           public static void symbolTriangle(int n) {

            for (int i = 0; i <= n; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    System.out.print("@");//@ @@ @@@
                }
                System.out.println("");//new line
            }
        }

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Input number of rows: ");
            symbolTriangle(scr.nextInt());//calls static method

        }

}
