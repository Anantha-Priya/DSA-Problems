import java.util.Scanner;

public class NthNumSeries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}


//num->    1 3 6 10 15 21
//diff->    2 3 4  5  6