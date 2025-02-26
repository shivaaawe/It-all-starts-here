package AC;

import java.util.Scanner;

public class pqs{
    public static void main(String[] args) {
        // Question 1 
        int a = 12;
        int b = 14;
        int c = 13;
        float avg = (a+b+c)/3;
        System.out.println(avg);

        //Question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square.");
        int side = sc.nextInt();
        float area = side*side;
        System.out.println("Area of the square is: "+area);

        //Question 3
        float pen = 10;
        float pencil = 5;
        float eraser = 2;
        float sum = pen+pencil+eraser;
        System.out.println("Cost of pen, pencil and eraser together is: "+sum);
        //Advanced - Adding 18% GST
        double gst = (18.0/100)*sum;
        double total = gst+sum;
        System.out.println("Total amount after adding gst is: "+total);

        int $ = 6;
        System.out.println($);
        sc.close();

    }
}