package Java_Basics;

public class GreetFn {
    public static void main(String[] args) {
        String greetmessage = myGreet("Chaitanya");
        System.out.println(greetmessage);
    }

    static String myGreet(String name) {
        String message= "Hello, Good Morning " + name;
        return  message;
    }
}


/*
* return_type name (args){
*   //body
*   return statement;
* }
* */