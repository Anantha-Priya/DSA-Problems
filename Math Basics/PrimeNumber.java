// To check whether a number is prime,use a loop that tests for factors upto the square root of number.
//  A prime number is a number greater than 1 that cannot be formed by multiplying two smaller natural

import java.util.Scanner;

public class PrimeNumber {
    static boolean IsPrime(int x){

           for(int i=2;i*i<=x;i++){                   //This inner loop iterate the divisors
                if(x%i==0){
                    return false;
                }
          }
          return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println(n+" is not prime");
        }
        
        for(int x=2;x<=n;x++){                          //This outer loop iterate the number
            if(IsPrime(x)){
                System.out.println(x+" ");
            }
        }
    }
}

