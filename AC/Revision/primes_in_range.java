package AC.Revision;

public class primes_in_range {
    public static boolean primeornot(int n){
        if (n==2){
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
         return true;
    }
    public static void prime_range(int n){
        for(int i=2;i<=n;i++){
            if(primeornot(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        prime_range(12);
    }
}
