package AC.Loops;

public class reverse_the_given_number {
    public static void main(String[] args) {
        int n = 715;
        int rev = 0;
        while (n>0){
            int lastDigit = n % 10;
            rev = (rev * 10)+lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
