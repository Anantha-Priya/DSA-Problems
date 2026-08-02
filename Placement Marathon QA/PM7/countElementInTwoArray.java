import java.util.*;

public class countElementInTwoArray {
     public static int[] countElement(int[] a,int n,int[] b,int m){
        Arrays.sort(b);
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int l=0,h=m-1;
            int count=0;
            
            while(l<=h){
                int mid=l+(h-l)/2;
                
                if(b[mid]<=a[i]){
                    count=mid+1;
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int result[]=countElement(a,n,b,m);
        for(int i=0;i<n;i++){
            if(i>0)
               System.out.print(", ");
            System.out.print(result[i]);
        }
    }
}
