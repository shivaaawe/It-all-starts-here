package AC.Patterns_Advanced;

public class solid_rhombus {
    public static void pattern_solid_rhombus(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_solid_rhombus(5);
    }
}
