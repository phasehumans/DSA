package Java_Basics;

public class Reverse {
    public static void main(String[] args) {
        int num = 3829;

        int ans= 0;
        while(num > 0){
            int last= num % 10;
            ans= ans * 10 + last;
            num/=10;

        }
        System.out.println(ans);

    }
}
