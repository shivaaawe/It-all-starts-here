package AC.Functions;

public class binary_to_decimal {
    public static void bintodec(int binNum){
        int pow=0;
        int decNum=0;
        while (binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum/=10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        bintodec(1010101010);
    }
}
