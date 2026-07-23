// Prob 4: Write a program using switch case which takes a value and prints the respective Size.


import java.util.Scanner;
class size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        switch(s){
            case 29:
              System.out.println("Small Size");
              break;
            case 30:
              System.out.println("Medium Size"); 
              break;
            case 38:
              System.out.println("Large Size");
              break;
            case 42:
              System.out.println("XLarge Size");
              break;
            default:
              System.out.println("Invalid Size (need to enter size:29,30,38,42)");  
              break;             
        }

    }
}
