package AC.Arrays;

public class max_subarray_sum_kadanes {
    public static void kadanes(int [] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<numbers.length;i++){
            currentSum = currentSum + numbers[i];
            if(currentSum<0){
                currentSum = 0;
            }
            // or we can even try this => maxSum = Math.max(currentSum, maxSum);
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int [] numbers = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
