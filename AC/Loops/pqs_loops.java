package AC.Loops;

import java.util.Scanner;

public class pqs_loops {
    public static void main(String[] args) {
        //Question 1
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            i+=2;
        }

        //Question 2 - Write a program that reads a set of integers, and then prints the sum of the even and odd integers
        int even_sum = 0;
        int odd_sum = 0;
        for (int i=0;i<=10;i++){
            if (i%2==0){
                even_sum += i;  
            }
            else if(i%2!=0){
                odd_sum += i;  
            }
        }
        System.out.println("Sum of even numbers for the given range: "+even_sum);
        System.out.println("Sum of odd numbers for the given range: "+odd_sum);

        //Question 3 - Factorial of the given number 
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int fact = 1; //To store the factorial
        int num = sc.nextInt(); //Input from the user
        int i = 1;
        while (i<=num){
            fact *= i;
            i++;
        }
        System.out.println(fact);

    }
}
