import java.util.*;

public class firstAndLastOccurence {
    // Find First Occurrence
    static int firstOccurrence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;   // Search on the left
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Find Last Occurrence
    static int lastOccurrence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;    // Search on the right
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int first = firstOccurrence(arr, x);

        if (first == -1) {
            System.out.println(-1);
        } else {
            int last = lastOccurrence(arr, x);
            System.out.println(first);
            System.out.println(last);
        }

        sc.close();
    }
}
