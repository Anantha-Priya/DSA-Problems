import java.util.*;
public class printDivisors {
    static ArrayList<Integer> printDiv(int n,int i){
         if(i>n){
            return new ArrayList<>();    //When recursion reaches the end, it needs to return something so that previous calls can continue working.
                                         // So the last call returns an empty list:
         }
         ArrayList<Integer> result=printDiv(n,i+1); 
         if(n%i==0){
            result.add(i);
         }
         return result;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> divisors= printDiv(n,1);
        System.out.println(divisors);
        sc.close();
    }
}
