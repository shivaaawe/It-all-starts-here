package AC;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        int number = 4;
        String check = ((number%2)==0)?"even":"odd";
        System.out.println(check);

        //Checking if a student is pass or fail
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        int border = 33;
        String check1 = (marks>=border)?"pass":"fail";
        System.out.println(check1);
        sc.close();
    }
    
}
