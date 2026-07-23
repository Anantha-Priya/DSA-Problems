// ****
// ****
// ****
// ****

import java.util.Scanner;
class Pattern1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
             //System.out.print("\n"); instead of this line we can use the builtin function
             System.out.println();
        }
        sc.close();
    }

}