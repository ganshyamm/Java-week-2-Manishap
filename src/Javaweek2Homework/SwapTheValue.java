package Javaweek2Homework;

//Write a Java program to swap two variables.

import java.util.Scanner;

public class SwapTheValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first variable value : ");
        int first = sc.nextInt();
        System.out.print("Enter the second variable value : ");
        int second = sc.nextInt();
        SwapTheValue t = new SwapTheValue();
        t.swapTheValue(first, second);
    }
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }


}
