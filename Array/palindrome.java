// arr=[2,3,4,3,2] is palindrome array and checked using "" TWO POINTER METHOD ""

public class palindrome {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,3};
        int left=0, right=(arr.length-1);
        while (left<right) { 
            if(arr[left]!=arr[right]){
                System.out.print("Not Palindrome");
                return ;           // this return statement break the loop and prevent the remaining print statement outside loop from executing
            }  
            left++;
            right--;
        }
        System.out.print("Palindrome");
    }
}
