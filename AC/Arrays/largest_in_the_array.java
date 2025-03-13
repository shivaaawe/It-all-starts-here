package AC.Arrays;


public class largest_in_the_array {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,14,5,6,7,8,9,10};
        System.out.println("The largest element is: "+largest(numbers));

    }
}
