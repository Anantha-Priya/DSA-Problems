import java.util.*;

public class findPrimeTillN {
          static int prime(int n){
        int a[]=new int[n+1];
        Arrays.fill(a,1);
        a[0]=0;
        a[1]=0;
        int count=0;
        for(int i=2;i<=n;i++){
            if(a[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(a[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=prime(n);
        System.out.println(result);
    }
}
