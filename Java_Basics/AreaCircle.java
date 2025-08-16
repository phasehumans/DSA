package Java_Basics;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius of circle: ");
        float radius= sc.nextFloat();
        double pieValue= 3.14;

        double res= pieValue * radius * radius;
        System.out.println("Area of Circle: " + res);

    }
}
