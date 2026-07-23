// Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.


import java.util.Scanner;

class triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int sum=a1+a2+a3;
        if(sum==180){
            System.out.println("The Triangle can be formed");
        }
        else{
            System.out.println("The Triangle can't be formed");
        }
    }
}