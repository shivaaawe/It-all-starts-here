import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        System.out.println("Case Checker");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase.");
        }else{
            System.out.println("Uppercase");
        }
        sc.close();
    }
}
