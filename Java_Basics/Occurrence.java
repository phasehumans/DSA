package Java_Basics;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();

        System.out.print("Enter number to find: ");
        int find= sc.nextInt();
        int count= 0;

        while(num > 0) {
            int last = num % 10;

            if (last == find) {
                count++;
            }
            num = Math.floorDiv(num, 10);
//            or num= num / 10;
        }
        System.out.println(count);



    }
}
