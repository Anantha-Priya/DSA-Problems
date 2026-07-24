// Floor = the largest number that is less than or equal to x.
// Ceil = the smallest number that is greater than or equal to x.
import java.util.*;
public class floorAndCeil {
    public static void main(String[] args) {
        int []arr={2,4,1,5,2,3,7,8,0};
        Arrays.sort(arr);
        int x=6;
        int low=0, high= arr.length-1;
        int floor=-1;
        int ceil=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                System.out.println(arr[mid]+" "+arr[mid]);
            }
            else if(arr[mid]<x){
                floor=arr[mid];
                low=mid+1;
            }else{
                ceil=arr[mid];
                high=mid-1;
            }

        }
        System.out.println(floor+" "+ceil);
    }
}
