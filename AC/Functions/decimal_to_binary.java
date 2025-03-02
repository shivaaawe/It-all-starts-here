package AC.Functions;

public class decimal_to_binary {
    public static void dectobin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while (decNum>0){
            int remainder = decNum%2;
            binNum = binNum + (remainder*(int)Math.pow(10, pow));
            pow++;
            decNum/=2;
        }
        System.out.println("The binary number of the decimal number "+myNum+" is: "+binNum);
    }
    public static void main(String[] args) {
        dectobin(45);
    }
}
