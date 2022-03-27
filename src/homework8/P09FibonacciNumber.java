package homework8;

import java.util.Scanner;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class P09FibonacciNumber {
    public static void isFibonacci(int count){
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;//adds n1&n2
            System.out.print(" "+n3);
            n1=n2;//assigns value of n2 to n1
            n2=n3;//assigns value of n3 to n2
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(scr.nextInt());//calling static method
    }
}
