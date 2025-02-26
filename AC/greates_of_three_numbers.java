package AC;

public class greates_of_three_numbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;
        if (a>=b && a>=c){
            System.out.println("A is greater");
        }
        else if (b>=c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}
