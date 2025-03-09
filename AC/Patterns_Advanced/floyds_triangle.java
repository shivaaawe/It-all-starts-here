package AC.Patterns_Advanced;

public class floyds_triangle {
    public static void pattern_floyds_triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_floyds_triangle(12);
    }   
}
