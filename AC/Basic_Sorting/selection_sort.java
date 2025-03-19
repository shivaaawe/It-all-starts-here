package AC.Basic_Sorting;

public class selection_sort {
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,3,6,2};
        selectionsort(arr);
        printArray(arr);
    }
}
