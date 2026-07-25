public class ElementAppearOnce {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int i=0,j=arr.length-2;
        
        while(i<=j){
            int mid= i+(j-i)/2;
            
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                   i=mid+1; 
                }
                else{
                    j=mid-1;
                }
            }else{
                if(arr[mid]==arr[mid-1]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        System.out.println(arr[i]);
    }
}
