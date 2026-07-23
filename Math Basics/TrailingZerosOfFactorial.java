import java.util.Scanner;
public class TrailingZerosOfFactorial {
    static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=Factorial(n);
        int count=0;
        // while(x>0){
        //     int ld=x%10;
        //     if(ld==0){
        //         count++;
        //     }
        //     x/=10;
        // }

        // Above code will calculate all zeroes, 10200 count=3,but we need only zeros at the end ,count=2
        while (x%10==0){    // this loop will break when any number comes in between zeroes.
            count++;
            x/=10;
        }
        System.out.print(count);
    }
}
