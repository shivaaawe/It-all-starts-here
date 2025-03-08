package AC.Patterns_Advanced;

public class inverted_half_pyramid {
    public static void pattern_inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();       
        }      
    }
    public static void main(String[] args) {
        pattern_inverted_half_pyramid(4);        
    }
}
