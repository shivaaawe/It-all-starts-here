package AC.Functions;
import java.util.*;

public class primes_in_range {
    public static boolean prime_or_not(int n){
        if(n==2){
            return true;
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void primes_in_range1(int n){
        for(int i=2; i<=n; i++){
            if(prime_or_not(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and find out all the possible prime numbers uptill that number:");
        int a = sc.nextInt();
        System.out.print("The prime numbers uptill "+a+" are: ");
        primes_in_range1(a);
        sc.close();
    }
}
