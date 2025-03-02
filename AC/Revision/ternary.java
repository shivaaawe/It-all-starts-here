package AC.Revision;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String check = (age>=18 && age<=60)?"You're allowed to drive.":"No, you're not allowed to drive.";
        System.out.println(check);
        sc.close();
    }
}
