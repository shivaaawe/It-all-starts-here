import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter a number to print out the Fibonacci Series.");
        int number = sc.nextInt();
        for(int i=0;i<=number;i++){
            System.out.println(firstNumber);
            int nextNumber = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            sc.close();
        }
    }
}