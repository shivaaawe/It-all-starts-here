package AC.Functions;

public class binomial_coefficient {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomial = fact_n / (fact_r*fact_nmr);
        return binomial;
    }
    public static void main(String[] args) {
        System.out.println(binomial(5,2 ));
    }
}
