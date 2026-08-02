import java.util.*;

public class twoArrayProduct {
    static long Product(int n,int[] a){
        long product=1;
        for(int i=0;i<n;i++){
            product=a[i]*product;
        }
        return product;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        long result1=Product(n,arr1);
        long result2=Product(n,arr2);
        if(result1==result2){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}
