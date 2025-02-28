package AC.Loops;

import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number==2){
            System.out.println("Prime");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<Math.sqrt(number);i++){
                if (number%i==0){
                    isPrime=false;
                }
            }
            if (isPrime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not a Prime.");
            }
        }
        sc.close();
    }
}
