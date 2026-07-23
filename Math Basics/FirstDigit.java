import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int ld=n%10;
            if(ld%2==0){
                count=count+1;
            }
            if(n==ld){            
                System.out.println("First Digit: "+ld);
            }
            n=n/10;
        }
        System.out.print("Odd Digit Count: "+count);

        sc.close();
    }
}
