import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Calculator Program");
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while(true){
            System.out.println("Enter the operator");
            char operator = sc.next().trim().charAt(0);
            if (operator=='+' || operator=='-' || operator=='/' || operator=='*' || operator=='%' || operator=='^'){
                System.out.println("Please enter two numbers");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                if (operator=='*'){
                    ans=num1*num2;
                }
                if (operator=='+'){
                    ans=num1+num2;
                }
                if (operator=='-'){
                    ans=num1-num2;
                }
                if (operator=='/'){
                    if (num2!=0){
                        ans=num1/num2;
                    }
                }
                if (operator=='%'){
                    ans=num1%num2;
                }
                if (operator=='^'){
                    ans=Math.pow(num1, num2);
                }
            }else if (operator=='x' || operator=='X') {
                System.out.println("Bye Bye!");
                break;
            }
            else{
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
