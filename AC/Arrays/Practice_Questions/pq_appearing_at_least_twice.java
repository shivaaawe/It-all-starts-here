package AC.Arrays.Practice_Questions;

public class pq_appearing_at_least_twice {
    public static boolean appearing_at_least_twice(int [] numbers){
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,6};
        System.out.println(appearing_at_least_twice(numbers));
    }
}
