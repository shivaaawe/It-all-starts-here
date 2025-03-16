package AC.Arrays;

public class max_subarray_sum_prefix {
    public static void maxsubarraysumprefix(int [] numbers){
        int maxSum = Integer.MIN_VALUE;

        //new array
        int prefix [] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int currSum = i == 0? prefix[j] : prefix[j] - prefix[i-1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maxsum of the Subarray using Prefix Sum Approach is: "+maxSum);
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,-3,4,5,-5,6,-7};
        maxsubarraysumprefix(numbers);
    }
}
