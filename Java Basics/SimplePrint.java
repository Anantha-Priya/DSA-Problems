//Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


import java.util.Scanner;
class SimplePrint {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number:");
       int num= sc.nextInt();
       sc.nextLine();
       System.out.println("Enter a String:");
       String word= sc.nextLine();
       System.out.println("Enter a Character:");
       char letter= sc.next().charAt(0);
       System.out.printf("%d %s %c\n",num,word,letter);
    }
}