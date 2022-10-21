package Javaweek2Homework;
// Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lenght of the triangle: ");
        int lenght = scanner.nextInt();
       // areaOfTriangle(lenght, height);
        scanner.close();
    }

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }
}
