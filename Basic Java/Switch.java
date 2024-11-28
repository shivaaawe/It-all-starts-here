import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = sc.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Guava":
                System.out.println("Green good looking fruit");
            case "Apple":
                System.out.println("An Apple a day keeps the doctor away.");
            case "Custard Apple":
                System.out.println("Everyone's favourite.");
            default:
                System.out.println("Please enter a valid fruit name.");
                break;
        }
        sc.close();
    }
}
