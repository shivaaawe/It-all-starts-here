package AC.Arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating an array
        // dataType arrayName[]= new dataType[size];
        int marks [] = new int[50];

        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        System.out.println("Physics Marks: "+marks[0]);
        System.out.println("Math Marks: "+marks[1]);

        //marks after updation
        marks[1] = 98;
        marks[1]+=1;
        System.out.println("Updated Math Marks: " +marks[1]);

        int percentage = (marks[0]+marks[1])/2;
        System.out.println(marks.length);
        System.out.println("Percentage is:"+percentage+"%");
        sc.close();
    }
}
