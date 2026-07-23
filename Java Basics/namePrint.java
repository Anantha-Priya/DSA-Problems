// Prob 3: Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.


import java.util.Scanner;

public class namePrint {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String firstName=sc.nextLine();
       String lastName=sc.nextLine();
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
         System.out.println(firstName +" "+ lastName);
       }
    }
    
}

