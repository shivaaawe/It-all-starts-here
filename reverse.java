public class reverse {
    public static void main(String[] args) {
        System.out.println("Reverse the number");
        int number = 123456;
        int answer = 0;
        while(number>0){
            int remainder = number%10;
            number = number/10;
            answer = answer * 10 + remainder;
        }
        System.out.println(answer);
    }
}
