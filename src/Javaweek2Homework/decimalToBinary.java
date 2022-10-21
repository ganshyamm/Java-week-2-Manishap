package Javaweek2Homework;

import java.util.Scanner;

/**
 convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class decimalToBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = sc.nextInt();
        convertDecimalToBinary(number);
    }

    // Converting the decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
