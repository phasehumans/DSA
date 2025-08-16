package Java_Basics;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Diagonal One: ");
        float d1= sc.nextInt();
        System.out.print("Enter Diagonal Two: ");
        float d2= sc.nextInt();

        double res= (d1 * d2) / 2;
        System.out.println("Area of Rhombus: " + res);

    }
}
