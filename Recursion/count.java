import java.util.*;

public class count {
    static int countZero(int n){
        int count=0;
        if(n==0){
            return 0;
        }
        int ld=n%10;
        n=n/10;
        if(ld==0){
            return 1+countZero(n);      // If it found zero and then this recursive function get executes 
        }
        return countZero(n);            // If it doesn't found zero then this recursive function get executes

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result= countZero(n);           // static method can call another static method directly
        System.out.print(result);
    }
}
