//printing numbers in same N no.of.rows & columns 

import java.util.Scanner;

class Pattern2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(j);   //Main Logic
        }
        System.out.println();
       }
       sc.close();
   }
}

// ouput 1: (System.out.print(j);)
// 123
// 123
// 123

// ouput 2: (System.out.print(i);)
// 111
// 222
// 333



