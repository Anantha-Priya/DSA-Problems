
// Prints the digits of a number by traversing the number.


import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int ld= n%10;
            System.out.println(ld);
            n=n/10;
        }
        sc.close();
    } 
}
