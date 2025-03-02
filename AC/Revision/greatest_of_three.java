package AC.Revision;

public class greatest_of_three {
    public static void main(String[] args) {
        int a = 12;
        int b = 56;
        int c = 13;
        if (a>=c && a>=b){
            System.out.println(a+" is greater");
        }
        else if (b>=c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
    }
}
