package AC.Arrays;

public class arrays_as_function_arguments {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {12, 13, 14};
        update(marks);

        //to print the values of marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
