package OneStar;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);

        int n,x,subs;
        int t= sc.nextInt();


        for (int i= 0; i < t ; i++ ){
            n= sc.nextInt();
            x= sc.nextInt();

            //  subs= Math.floorDiv(n,6);
            //  System.out.println(subs);
            if (n%6==0){
                subs= (n / 6);
            }else{
                subs= (n / 6) + 1;
            }
            int rate= subs * x;
            System.out.println(rate);
        }

    }
}
