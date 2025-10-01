package Java_Basics;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        int og= num;
        int sum= 0;

        int digits= String.valueOf(num).length();
//        System.out.println(digits);

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
            System.out.println(sum);
        }

        if (sum == og){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }



    }
}
