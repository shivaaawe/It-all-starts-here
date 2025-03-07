package code360;

public class check_prime {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "NO";
        }
        if (num == 2) {
            return "YES";
        }
        if (num % 2 == 0) {
            return "NO";
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
    
}
