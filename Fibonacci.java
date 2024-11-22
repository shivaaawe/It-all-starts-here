import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(firstNumber);
            int nextNumber = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }

}
