import java.util.*;

public class numberPrint {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            count++;
            for(int j=count+1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Other Way 
        
        // for(int i=1;i<=N;i++){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     for(int j=i+1;j<=N;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
