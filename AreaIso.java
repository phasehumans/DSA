package Java_Basics;

import java.util.Scanner;

public class AreaIso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Side:");
        float side= sc.nextFloat();
        System.out.print("Enter Base:");
        float base= sc.nextFloat();

        float s= (side + side + base) / 2;
        double res= Math.sqrt(s * (s - side) * (s - side) * (s - base));

        System.out.println("Area of Isoceles Triangle: " +res);

    }
}
