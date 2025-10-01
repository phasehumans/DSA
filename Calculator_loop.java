package Java_Basics;

import java.util.Scanner;

public class Calculator_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int ans= 0;
        while(true){
            System.out.print("Enter the operator: ");
            char opt= sc.next().trim().charAt(0);
            if (opt == '+' || opt== '-' || opt == '*' || opt== '/'){
                int a= sc.nextInt();
                int b= sc.nextInt();

                if(opt == '+'){
                    ans= a + b;
                } else if (opt == '-') {
                    ans= a -b;
                } else if (opt == '*') {
                    ans= a * b;
                }else{
                    ans= a/b;
                }
            } else if (opt == 'X') {
                break;

            }
            else{
                System.out.println("Invalid operation");
            }

            System.out.println(ans);

        }
//        System.out.println(ans);
    }
}
