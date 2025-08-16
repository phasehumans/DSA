package Java_Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter n: ");
        int n= sc.nextInt();

        int a= 0;
        int b= 1;
        int count= 0;
        while (count < n){
            if (count <= 1){
                System.out.print(count + " ");
                count++;
            }
            else{
                int temp = b;
                b= b+a;
                a= temp;
                System.out.print(b + " ");
                count++;
            }



        }
    }
}
