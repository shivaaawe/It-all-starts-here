package AC.Loops;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum=0;
        while (num >= i){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
