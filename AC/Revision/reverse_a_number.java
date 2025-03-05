package AC.Revision;

import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){
            int lastDigit = a%10;
            rev = (rev*10) + lastDigit;
            a=a/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
