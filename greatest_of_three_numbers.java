import java.util.Scanner;

public class greatest_of_three_numbers{
    public static void main(String[] args) {
        System.out.println("Greatest of three numbers java program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //method 1
        // int max = a;
        // if (b > max){
        //     max = b;
        // }
        // if (c > max){
        //     max = c;
        // }
        // System.out.println(max);
        // sc.close();

        //method 2
        // int max=0;
        // if (a>b){
        //     max=a;
        // }else{
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(max);

        //method 3
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

        sc.close();
    }
}
