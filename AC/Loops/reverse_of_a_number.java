package AC.Loops;

public class reverse_of_a_number {
    public static void main(String[] args) {
        reverse_int(12);
    }
    public static int reverse_int(int number){
        while(number>0){
            int lastDigit1 = number % 10;
            System.out.print(lastDigit1);
            number = number / 10;
        }
        return 0;
    }
}
