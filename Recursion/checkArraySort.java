public class checkArraySort {
    static boolean checkSort(int[] arr,int i){
        if(i>=arr.length-1){                 // In sorting the array i shouldn't be equal to n-1 becuase index last index is(n-1) which shoud not be calculated
            return true;   //Reached the end of the array
        }
        if(arr[i]>arr[i+1]){
             return false;    //Found an unsorted pair
        }
        return checkSort(arr,i+1);
    }
    public static void main(String[] args){
        int [] arr={4,5,77,8,434,54,76};
        boolean result=checkSort(arr,0);
        System.out.println(result);
    }
}
