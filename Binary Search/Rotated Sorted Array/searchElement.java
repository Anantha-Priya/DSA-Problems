
public class searchElement {
    public static int search(int arr[],int key){
        int i=0,j=arr.length-1;
        
        while(i<=j){
            int mid=i+(j-i)/2;
            
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[i]<=arr[mid]){   //represents the sorted array
                if(key>=arr[i] && key<arr[mid]){
                    j=mid-1;              //Omitsright part
                }
                else{
                    i=mid+1;             
                }
            }
            else{
               if(key>arr[mid] && key<=arr[j]){
                   i=mid+1;
               }
               else{
                   j=mid-1;
               }
               
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        int x=2;
        
        System.out.println(search(arr,x));
    }
}
