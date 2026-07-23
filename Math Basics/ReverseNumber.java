import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        //345
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;          //0*10+5=5 -> 5*10+4=54  ->  54*10+3=543
            n/=10;
        }
        System.out.println(rev);
    }
}
