package Java_Basics;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base:");
        int base= sc.nextInt();
        System.out.print("Enter height:");
        int height= sc.nextInt();

        double res= 0.5 * (base * height);
        System.out.println("Area of triangle "+ res);
    }
}
