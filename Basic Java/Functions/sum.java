package Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add(sc);
        add(sc);
        add(sc);
        add(sc);
        sc.close();
        /*
         * Here, whenever we try to add the scanner in the main code, it gives us the error to close the scanner. 
         * But when we close the scanner it automatically closes and throws the error which would be difficult for us to run the methods more than once.
         * For that what we can do is, we should not close the Scanner object it will be reused. 
         * 
         * For that what we have done is, we have create a single scanner instance in the main() method and pass it as a parameter to the add() method.
         * This avoids creating and closing multiple Scanner objects. 
         * 
         * Close the Scanner only after all inputs are processed to the release resources.
         */
    }
    static void add(Scanner sc){
        System.out.println("Please enter number 1");
        int one = sc.nextInt();
        System.out.println("Please enter number 2");
        int two = sc.nextInt();
        int sum = one+two;
        System.out.println("The sum is: "+sum);

    }
}
