package Leetcode;

public class reverse_int {
    public int reverse(int number) {
        long reversed = 0; // Use long to detect overflow
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        reverse_int solution = new reverse_int();
        System.out.println(solution.reverse(123)); 
        System.out.println(solution.reverse(-123)); 
        System.out.println(solution.reverse(1534236469));
    }
}
