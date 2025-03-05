package AC.Functions;

public class primeornot {
    public static boolean primeornot1(int n){
        if (n==2){
            return true;
        }
        for(int i=2; i<= n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      System.out.println(primeornot1(12));
    }
}
