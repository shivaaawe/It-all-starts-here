package AC.Revision;

public class nth_fibonacci {
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        int a = 1; int b = 1; int fib = 1;
        for (int i=3; i<=n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }
}
