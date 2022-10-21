package Javaweek2Homework;

import java.util.Scanner;

/* print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class AreaOfPerimeter {
    //calculating the area of perimeter and rectangle
    public static void areaAndPerimeterofRectangle(int height,int width){
        int area = (height * width);
        int perimeter = 2 * (height + width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int height = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int width = sc.nextInt();
        areaAndPerimeterofRectangle(height, width);
    }

}




