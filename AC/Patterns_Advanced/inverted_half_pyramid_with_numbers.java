package AC.Patterns_Advanced;

public class inverted_half_pyramid_with_numbers {
    public static void pattern_inverted_half_pyramid_with_numbers(int n){
        // Method 1
        System.out.println("Method 1");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Method 2");
        //Method 2
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_inverted_half_pyramid_with_numbers(7);  
    }
}
