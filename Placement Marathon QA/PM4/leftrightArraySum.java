import java.util.*;

public class leftrightArraySum {
        public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int N=n/2, sum1=0, sum2=0;
        for(int i=0;i<N;i++){
            sum1= sum1+a[i];
        }
        for(int i=N;i<n;i++){
            sum2=sum2+a[i];
        }
        int product=sum1*sum2;
        System.out.print(product);

        // int mid=n/2;
        // int sum1=0,sum2=0;
        
        // for(int i=0;i<mid;i++){
        //     sum1+=arr[i];
        // }
        // for(int i=mid;i<n;i++){
        //     sum2+=arr[i];
        // }
        // System.out.print(sum1*sum2);
    }
}
