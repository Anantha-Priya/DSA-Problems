import java.util.Scanner;
public class SumOfNaturalNum {
    public static int seriesSum(int n) {
        // code here
        int sum=0;
        while(n>0){
            sum=n+sum;
            n--;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(seriesSum(n));
    }
}

//use while loop to caluclate the sum in backwards
//And use for to calculate it from forward.
