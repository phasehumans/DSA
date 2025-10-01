package OneStar;

import java.util.*;
import java.lang.*;
public class GreaterAvg {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();

        for(int i= 0; i < T; i++ ){
            int A= sc.nextInt();
            int B= sc.nextInt();
            int C= sc.nextInt();

            float avg= (A + B)/2.0f;
            // 		floatig point err -> 6.0 added .0f then 6.5


            // 		System.out.println(avg);
            // 		System.out.println(C);

            if (avg > C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }



    }
}
