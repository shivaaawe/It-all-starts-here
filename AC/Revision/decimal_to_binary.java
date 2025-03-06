package AC.Revision;

public class decimal_to_binary {
    public static void dectobin(int decNum){
        int pow=0;
        int binNum=0;
        while (decNum>0){
            int remainder = decNum%2;
            binNum = binNum + (remainder*(int)Math.pow(10,pow));
            pow++;
            decNum/=2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        dectobin(12);
    }
}
