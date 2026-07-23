// public class TraverseArray {
//     static void recArray(int[] arr,int i){
//         if(i>=arr.length){
//             return ;
//         }
//         System.out.println(arr[i]);
//         recArray(arr,i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,1,5,9,3,6,5,23};
//         recArray(arr,0);
//     }
// }

// LINEAR SEARCH EXAMPLE (Searching the )
public class TraverseArray {
    static void recArray(int[] arr,int i,int target){
        if(i>=arr.length){
            return ;
        }
        if(arr[i]==target){
            System.out.println(i) ;
        }
        else{
            recArray(arr,i+1,target);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,9,3,6,5,23};
        recArray(arr,0,3);
    }
}
