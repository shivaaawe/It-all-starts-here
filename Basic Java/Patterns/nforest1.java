public class nforest1 {
    public static void npattern1(int n){
        for (int i = 0;i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        npattern1(n);
    }
}
