//Case 1: Missing Number in an Unsorted Array
public class missingElement1{
    public static void main(String[] args) {
        int[] arr = {3,1,5,4};
        int n = 5;

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        System.out.println(totalSum - arraySum);
    }
}