//The largest bubble rises to the top after each pass.
// compare adjacent elements if a[i] > a[i+1] then swap else no swap like this in the first iteration,
//the largest element (8) has reached the last position.
//Now don't compare the last element because it is already sorted.(j<n-i-1) => n-1 represent last index and n-i-1 represents before the last index.
//This is why it is called Bubble Sort.

// TC- 0(n^2)
public class bubbleSort {
    public static void main(String[] args){
    int a[]={4,5,3,6,7,8,2};
    int n=a.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){           //if(a[j]<a[j+1])
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
        }   
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    } 
    }
}
