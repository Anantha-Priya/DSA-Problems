// Index -             0 1 2 3 4 5 6  7  8
// Fibonacci Series -  0 1 1 2 3 5 8 13 21 . . . . .

// Fibonacci Series Formula -> fibo(n)=fibo(n-2)+fibo(n-1);
import java.util.*;
public class fibonacci{
     static int fibo(int n){
        if(n==0){
            return 0;     
        }
        if(n==1){
            return 1;
        }
        return fibo(n-2)+fibo(n-1);    
    }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int result=fibo(n);
    System.out.println(result);
  }   
}