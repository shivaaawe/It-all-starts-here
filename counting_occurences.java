public class counting_occurences {
    public static void main(String[] args) {
        System.out.println("Counting Occurences.");
        int x = 12323222;
        int count = 0;
        while (x>0){
            int remainder = x%10;
            if(remainder==2){
                count++;
            }
            x=x/10;
        }
        System.out.println(count);
    }
}
