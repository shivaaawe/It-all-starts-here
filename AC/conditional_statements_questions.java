package AC;

import java.util.Scanner;

public class conditional_statements_questions {
    public static void main(String[] args) {
        //Question 1 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }

        //Question 2
        System.out.println("Enter your body temperature");
        double temp = sc.nextDouble();
        if (temp > 100){
            System.out.println("fever");
        }
        else{
            System.out.println("No fever");
        }

        //Question 3
        System.out.println("Enter a number");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                    break;
            case 2:
                System.out.println("Tuesday");
                    break;
            case 3:
                System.out.println("Wednesday");
                    break;
            case 4:
                System.out.println("Thursday");
                    break;
            case 5:
                System.out.println("Friday");
                    break;
            case 6:
                System.out.println("Saturday");
                    break;
            case 7:
                System.out.println("Sunday");
                    break;
            default:
                System.out.println("Please enter correct number.");
                    break;
        }

        //Question 4
        int b = 63, c = 36;
        boolean x = (b<c)?true:false;
        int y = (b>c)?b:c;
        System.out.println(x);
        System.out.println(y);

        //Question 5 (Leap year or not)
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year +" is a leap year");
        }
        else {
            System.out.println(year +" is not a leap year");
        }
        sc.close();
    }
}
