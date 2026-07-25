public class peakElement {

    public static int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args){
        int arr[]={1,2,3,5,4,3,2,1,3};
        System.out.println(findPeakElement(arr));
    }
}
