package Javaweek2Homework;
//Write a program to convert the upper case to lower case.


import java.util.Scanner;

public class ConvertUpperToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase string:");
        String uppercase = sc.nextLine();
        ConvertUpperToLowercase t = new ConvertUpperToLowercase();
        t.convertUppercaseToLowercase(uppercase);

    }

    //Conversion of Uppercase to lower case method
    public void convertUppercaseToLowercase(String text) {
        System.out.println("The Lowercase value is=" + text.toLowerCase());
    }

}
