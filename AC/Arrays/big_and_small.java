package AC.Arrays;

public class big_and_small {
    public static int bigandsmall(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Largest number is "+largest);
        return smallest;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,5,3,14,52,56,54,34};
        System.out.println("Smallest value is "+bigandsmall(numbers));
    }
}
