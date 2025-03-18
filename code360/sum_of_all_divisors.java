package code360;

public class sum_of_all_divisors {
    public static int sumOfDivisor(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
    }
    return sum;
}
    public static int sumOfAllDivisors(int n){
        int totalSum = 0;
        for(int i=1; i<=n; i++){
            totalSum += sumOfDivisor(i);
        }
        return totalSum;
    }
    public static void main(String [] args){
        System.out.println(sumOfAllDivisors(10));
    }
}
