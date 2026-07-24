// Case 1: Missing Number in an Sorted Array

public class missingElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == mid + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low + 1);
    }
}
