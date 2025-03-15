package AC.Arrays;

public class max_subarray_sum_bruteforce {
    public static void maxsubarraysum(int [] numbers){
        int sum = 0;
        int num = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.println("=> Sum is:" +sum);
                if(num<sum){
                    num=sum;
                }
            }
        }
        System.out.println("Max sum of the subarray is "+ num);
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        maxsubarraysum(numbers);
    }
}
