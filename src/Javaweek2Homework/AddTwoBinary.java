package Javaweek2Homework;
/*Write a Java program to add two binary numbers.
Input first binary number: 10
Input second binary number: 11
*/

import java.util.Scanner;

public class AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = sc.nextLine();
        System.out.println("Please enter second binary number");
        String second = sc.nextLine();
        String addition = AddTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary number is : " + addition);

    }

    //Adding the two Binary Numbers
    public static String AddTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }


}



