import java.util.Scanner;
class LastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int LastDigit=n%10;
        System.out.println("Last Of Digit is:"+LastDigit);
        sc.close();
    }
}
