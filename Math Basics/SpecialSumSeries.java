import java.util.Scanner;

public class SpecialSumSeries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0; seriesTerm=0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         sum=sum+j;                         
        //     }
        // }
        for(int i=1;i<=n;i++){
            sum=sum+i;                 //sum stores 1 , 1+2, 1+2+3, 1+2+3+4....        each row answer
            seriesTerm=seriesTerm+sum;   //seriesTerm store 1+(1+2)+(1+2+3)+(1+2+3+4).... final answer
        }
        System.out.print(seriesTerm);
    }
}


//Special Sum of Series
//1+(1+2)+(1+2+3)+(1+2+3+4)+....+(1+2+3+4+n)

