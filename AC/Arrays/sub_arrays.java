package AC.Arrays;

public class sub_arrays {
    public static void subarrays(int numbers[]){
        int totalSubArrays = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = 0; // Initialize sum for the current subarray
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k]; // Add the current element to the sum
                }
                totalSubArrays++;
                System.out.println("=> Sum: " + sum); // Print the sum of the current subarray
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: "+totalSubArrays);
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,6,9,19};
        subarrays(numbers);
    }
}