package AC.Revision;

public class binomial_coefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bin_coe(int n, int r){
        int n1 = factorial(n);
        int r1 = factorial(r);
        int k = factorial(n-r);
        int binomial = n1/(r1*k);
        return binomial;
    }
    public static void main(String[] args) {
        System.out.println(bin_coe(5,3));
    }
}
