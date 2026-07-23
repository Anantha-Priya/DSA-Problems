//Wrt\ite a program to print the day of the week based on the Input
// 0- sun. 1-Mon , 2- Tue.....


import java.util.Scanner;
class week{
    public static void main(String[] args){
       System.out.println("Enter Your number");
       Scanner scan=new Scanner(System.in);
       int day=scan.nextInt();
       switch(day){
        case 0:
            System.out.println("Sunday");
            break;
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
       case 6:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Invalid Input");
       }
    }
}
