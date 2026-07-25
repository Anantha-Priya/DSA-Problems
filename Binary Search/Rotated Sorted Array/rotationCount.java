
public class rotationCount {

    public static int findKthRotaion(int arr[]) {
    
        int i=0,j=arr.length-1;
        
        while(i<j){
            int mid=i+(j-i)/2;
            
            if(arr[mid]>arr[j]){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i;
    }
    
    public static void main(String[] args){
        int arr[]={6,7,8,9,1,2,4};
        System.out.println(findKthRotaion(arr));
    }
}
