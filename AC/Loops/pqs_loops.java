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

        //Question 4 - Write a pogram to print the multiplication table of a number N, entered by the user.
        System.out.println("Enter a number to print the multiplication table.");
        int mul_num = sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(mul_num+" X "+j+" = "+(mul_num*j));
        }

        //Prime or not
        int prime_num = sc.nextInt();
        if (prime_num == 2){
            System.out.println("Is a prime");
        }
        else{
            boolean isPrime = true;
            for(int k=2;k<=prime_num-1;k++){
                if(prime_num%k==0){
                    isPrime = false;
                }
            }
            if (isPrime==true){
                System.out.println("Is prime");
            }
            else{
                System.out.println("Not a prime");
            }
        }
        sc.close();

    }
}
