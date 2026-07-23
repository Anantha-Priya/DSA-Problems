//Write a program to find the largest among three numbers

import java.util.Scanner;
class greater{
    public static void main(String[] args){
       System.out.println("Enter value for a,b,c");
       Scanner scan =new Scanner(System.in);
       int a=scan.nextInt();
       int b=scan.nextInt();
       int c=scan.nextInt();


       if (a>=b && a>=c) {
        System.out.println("A is Greater");
       }
       else if (b>=a && b>=c){
        System.out.println("B is Greater");
       }
       else{
        System.out.println("C is Greater");
       }
    }
}