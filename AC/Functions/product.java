package AC.Functions;

public class product {
    public static int products(int a, int b){
        int product = a * b;
        System.out.println("The product is: "+product);
        return 0; //here the return value would have returned 0, but we are not using the return value as the output,
        // we are using a sout above to print the product. 
        // If there is no sout above, then the output would be zero based on the return value.
    }
    public static void main(String[] args) {
        products(12, 12);
        products(34,23);
    }
}
