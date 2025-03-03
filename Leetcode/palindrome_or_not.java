package Leetcode;

public class palindrome_or_not {
    public static boolean isPalindrome(int x) {  
        int myNum = x;
        int rev = 0;
        
        if (x < 0) return false; // 
        
        while (x > 0) {
            int lastDigit = x % 10;
            rev = (rev * 10) + lastDigit;
            x /= 10;
        }
        
        return myNum == rev; 
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); 
    }
}
