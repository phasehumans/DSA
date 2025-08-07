package Java_Basics;

import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int p= input.nextInt();
        System.out.print("Enter Time in years: ");
        int t= input.nextInt();
        System.out.print("Enter rate: ");
        int rate= input.nextInt();

        int res= (p * rate * t) / 100;
        System.out.println("Simple Interest --> " + res);
    }
}
