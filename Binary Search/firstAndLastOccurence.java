
public class firstAndLastOccurence {
    public static void main(String[] args) {
        int arr[]={2,3,4, 5,5,5,5,6,7,8};
        int x=5;
        int first=-1;
        int last=-1;
        
        // First OCcurence
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                first = mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        
        //Last Occurence
        low=0;
        high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(first+" "+last);
    }
}
