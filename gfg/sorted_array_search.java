package gfg;

public class sorted_array_search {
    static boolean searchInSorted(int arr[], int k) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr [] = {1,2,3,4,56};
        int k = 2;
        System.out.println(searchInSorted(arr,k));
    }
}

