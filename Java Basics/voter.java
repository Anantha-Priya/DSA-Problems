//Write a Program to find the given is eligible to vote or not

import java.util.Scanner;
class voter{
    public static void main(String[] args){
       System.out.println("Enter Your Age");
       Scanner scan=new Scanner(System.in);
       int age=scan.nextInt();
       if (age>=18) {
        System.out.println("You're Eligible to vote");
       }
       else{
        System.out.println("You're Not Eligible to vote");
       }
    }
}