// Perfect Number - sum of divisors of that number is equal to that number.
//Eg: n=28,  divisors= 1, 2, 14, 4, 7, 28  sum=1+2+14+4+7=28(during sum we shouldn't include that number 28)

public class PerfectNumber {
    public static void main(String[] args) {
        int n=28, sum=1;           //sum needs to be initialized by 1 because every number is divisible by 1 that is it include the factor 1.
        for(int i=2;i*i<=n;i++){     // where n=28 we need to calculate till 5*5=25 so iterates till 5.
            if(n%i==0){
                sum=sum+i;

                if(i!=n/i){               // Add Pair Factor
                    sum=sum+(n/i);
                }
                
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
           System.out.println("Not a Perfect Number"); 
        }
    }
    
}
