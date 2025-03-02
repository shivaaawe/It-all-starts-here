package AC.Functions;

import java.util.Scanner;

public class pqs {
    public static void avg_of_3_numbers(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("The average of entered three numbers is: "+avg);
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void palindrome_or_not(int n){
        int rev = 0;
        int myNum = n;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==myNum){
            System.out.println(myNum+" Is a palindrome");
        }
        else{
            System.out.println(myNum+" Is not a palindrome");
        }
    }
    public static void math(int a, int b){
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(a));    
    }
    //Question 5 - Write a Java method to compute the sum of the digits in an integer.
    public static int sumDigits(int n){
        int sumOfDigits = 0;
        while (n>0){
            int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args) {
        //Question 1 - Write a Java method to compute the average of three numbers
        avg_of_3_numbers(12,13,14);
        //Question 2
        System.out.println(isEven(4));
        //Question 3 - To check if a number entered is palindrome or not. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not.");
        int a = sc.nextInt();
        palindrome_or_not(a);
        //Question 4
        math(12, 178);

        System.out.println("Enter an integer to find out the sum of digits in that integer.");
        int integer = sc.nextInt();
        System.out.println("The sum of integers in "+integer+" is "+sumDigits(integer));
        sc.close();
    }
}
