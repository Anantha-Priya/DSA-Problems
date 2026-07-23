// Prob 2: Write a program to take x and print multiples of x till 1000.

// This below code doesn,t work for every input.
// import java.util.Scanner;

// class multiples {
//      public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int x= sc.nextInt();
//         int i=1;
//         while(i<=10){
//             int m=x*i;
//             if(m<1000){
//                 System.out.println(m);
//             }
//             i++;
//         }
//      }
// }

import java.util.Scanner;

class multiples {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int currentValue=x;
        while(currentValue<1000){
            System.out.println(currentValue);
            currentValue+=x;
        }
     }
}

