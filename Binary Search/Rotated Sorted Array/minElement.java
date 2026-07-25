
public class minElement {
    public static int findMin(int[] nums) {
        int i=0,j=nums.length-1;

        while (i < j) {

            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }

        return nums[i];
    }
    public static void main(String[] args){
        int arr[]={5,6,7,8,1,2,3,4};

        System.out.println(findMin(arr));
    }

}
