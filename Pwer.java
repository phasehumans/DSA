package Java_Basics;

import java.util.Scanner;

public class Pwer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base= sc.nextInt();
        int pwr= sc.nextInt();
        int res= 1;

//        int res= Math.pow(base, pwr);
//        System.out.println(res);

        for(int num= 0; num < pwr ; num++){
            res= res * base;

        }
        System.out.println(res);
    }
}
