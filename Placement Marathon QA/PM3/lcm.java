import java.util.*;

public class lcm {
    static long findGcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static long findLcm(long a, long b){
        if(a==0||b==0){
            return 0;
        }
        long gcd=findGcd(a,b);
        
        return (a/gcd)*b;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextInt();
        long n2=sc.nextInt();
        
        long result=findLcm(n1,n2);
        System.out.println(result);
    }
}
