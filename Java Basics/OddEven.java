import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
       System.out.println("Enter Your Number");
       Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       if (num>=0){
        if (num%2==0){
            System.out.println("The Given number is Positive & Even");
        }
        else{
            System.out.println("The Given number is Positive & Odd");
        }
       }
       else{
        System.out.println("The Given Number is Negative");
       }
    }
}
