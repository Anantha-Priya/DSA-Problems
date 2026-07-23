//            4 / 3 5 2 6 7 
// left sorted /  Right Unsorted
// TC- 0(n^2)

public class insertionSort {
    public static void main(String[] args){
    int a[]={4,3,5,2,6,7};
    int n=a.length;
    for(int i=1;i<n;i++){
        int key = a[i];     //a[1] =3
        int j=i-1;          //0
        while(j>=0 && key<a[j]){      //j=0 , 3<4
            a[j+1]=a[j];              // a[1]=4
            j--;                      //j=-1 the loop breaks
        }
        a[j+1]=key;                   //a[0]=3 
    } 
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    } 
    }
}
