package Java_Basics;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter length: ");
        float l= sc.nextFloat();
        System.out.print("Enter width: ");
        float w = sc.nextFloat();

        double res= 2* (l + w);
        System.out.print("Perimeter of Rectangle: "+ res);
    }
}
