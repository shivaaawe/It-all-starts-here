package code360;

import java.util.Scanner;

public class nth_fibonacci_number {
        public static int fibonacci(int n) {
            if (n == 1 || n == 2) {  // Base case check
                return 1;
            }
    
            int a = 1, b = 1, fib = 1;
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(fibonacci(n));  
            sc.close();
        }
    }

