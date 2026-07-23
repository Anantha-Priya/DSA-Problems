
import java.util.Arrays;

// this is an alogorithm used to find prime numbers


public class sieveOfEratothenes {

    static void printPrime(int n){
        int a[]=new int[n+1];          // 1-based Indexing 
        Arrays.fill(a,1);
        a[0]=0;
        a[1]=0;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(a[i]==1){
                for(int j=i*i;j<=n;j=j+i){
                    a[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(a[i]==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrime(10);     // static method can only directly call static method
    }
}
