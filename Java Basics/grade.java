// Prob 3:  Given mark of student, Print the Grade

import java.util.Scanner;
class grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Grade A");
        }
        else if (mark>=80 && mark<90) {
            System.out.println("Grade B");
        }
        else if (mark>=60 && mark<80) {
            System.out.println("Grade C");
        }
        else if (mark>=35 && mark<60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
