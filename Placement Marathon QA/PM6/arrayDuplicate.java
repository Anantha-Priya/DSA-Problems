import java.util.*;

public class arrayDuplicate {
    static boolean binarySearch(int[] arr,int low,int high,int target){
            while(low<=high){
                int mid=low+(high-low)/2;
                
                if(arr[mid]==target)
                  return true;
                else if(arr[mid]<target)
                  low=mid+1;
                else
                  high=mid-1;
            }
            return false;
        }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        boolean found=false;
        
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1])
               continue;
               
            if(binarySearch(arr,i+1,n-1,arr[i])){
                System.out.print(arr[i]+" ");
                found=true;
            }
        }    
        
        if(!found)
           System.out.print("[]");
        
    }
}
