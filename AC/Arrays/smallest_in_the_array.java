package AC.Arrays;

public class smallest_in_the_array {
    public static int smallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={12,14,5,15,78,34,89,234,231};
        System.out.println("The smallest in the array is: "+smallest(numbers));
    }
}
