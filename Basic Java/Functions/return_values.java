package Functions;

import java.util.Scanner;

public class return_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Return an interger without any parameters provided.
        int answer = add(sc);
        System.out.println(answer);

        // Return a string without any parameters provided.
        String answer1 = message();
        System.out.println(answer1);

        // Return an interger with parameters provided.
        int answer2 = add1(12, 12);
        System.out.println(answer2);

        // Return a string with parameters provided.
        String answer3 = message1("Shiva");
        System.out.println(answer3);

        // What if we provide the input for the numbers and name?
        System.out.println("Please enter the two numbers!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer4 = add1(a, b);
        System.out.println(answer4);

        System.out.println("Please enter your name for a greeting!");
        String name = sc.next();
        String answer5 = message1(name);
        System.out.println(answer5);
        sc.close();
    }
    // Return an integer
    static int add(Scanner sc){
        System.out.println("Please enter number 1");
        int one = sc.nextInt();
        System.out.println("Please enter number 2");
        int two = sc.nextInt();
        int sum = one+two;
        return sum; // Here without a return value, the program doesn't end because we have asked it to return an interger and ofcourse it returns something.
    }

    // Return a String
    static String message(){
        String greeting = "how are you, my baby boy?";
        return greeting;
    }

    // Adding parameters (interger)
    static int add1(int a, int b){
        int sum = a+b;
        return sum;
    }

    // Adding parameters (String)
    static String message1(String name){
        String greeting1 = "Hello "+name;
        return greeting1;
    }
    
}
