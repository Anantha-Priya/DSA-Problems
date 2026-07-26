public class largestSumArray {
    public static int checkSplits(int[] nums,int m){
        int split=1;
        int sum=0;

        for(int x:nums){
            if(sum+x <= m){
                sum+=x;
            }else{
                sum=x;
                split++;
            }
        }
        return split;
    }
    static int spiltArray(int[] arr,int s){
        int l=0,h=0;
        int ans=0;

        for(int x:arr){
            l=Math.max(l,x);
            h+=x;              //Total elements
        }
        while(l<=h){
            int mid=l+(h-l)/2;

            int split=checkSplits(arr, mid);
            if(split<=s){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        int k=2;
        System.out.println(spiltArray(arr,k));
    }
}
