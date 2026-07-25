public class treeCutting {

    public static void main(String[] args) {

        int[] arr = {20, 15, 10, 17};
        int m = 7;

        System.out.println(maxHeight(arr, m));
    }

    public static int maxHeight(int[] arr, int m) {

        int low = 0;
        int high = arr[0];
        int n = arr.length;
        int ans = -1;

        // Find the maximum tree height
        for (int i = 0; i < n; i++) {
            high = Math.max(high, arr[i]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long wood = checkHeight(arr, n, mid);

            if (wood >= m) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static long checkHeight(int[] tree, int n, int h) {

        long wood = 0;

        for (int i = 0; i < n; i++) {

            // Collect wood only from trees taller than the cutting height
            if (tree[i] > h) {
                wood += (tree[i] - h);
            }
        }

        return wood;
    }
}
