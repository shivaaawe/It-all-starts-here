package AC.Revision;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Neither Prime not Composite");
        }
        if (a==2){
            System.out.println("Prime");
        }
        else{
            boolean isPrime = true;
            for(int i=3; i<=Math.sqrt(a);i++){
                if(a%i==0){
                    isPrime = false;;
                }
            }
            if(isPrime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        sc.close();
    }
}
