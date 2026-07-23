import java.util.*;

public class sumOfArray {
    static int sumArray(int[] a,int n,int i ){
        if(i>=n){
            return 0;
        }
        return a[i]+sumArray(a,n,i+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=sumArray(arr,n,0);
        System.out.println(result);

    }
}
