package AC.Functions;

import java.util.Scanner;

public class hello {
    public static void helloworld(){
        System.out.println("Hello World");
    }
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;

    }
    public static void main(String[] args) {
        helloworld();
        helloworld();
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        System.out.println(calculateSum(12,12));
        sc.close();
    }
}
