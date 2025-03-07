package Leetcode;

public class fibonacci {
    public static int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        int a = 1; int b = 1; int fib = 1;
        for(int i=3; i<=n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;    
    }
    public static void main(String[]args){
        System.out.println(fib(12));
    }
}
