public class partitionPainter {
    public static int minBoards(int[] lengths,int m){
        int p=1;
        int sum=0;
        
        for(int x:lengths){
           if(sum+x <= m){
               sum+=x;
           } 
           else{
               sum=x;
               p++;
           }
        }
        return p;
    }
    public static int minTime(int[] arr, int k) {
        int l=0,h=0;
        int ans=0;
        
        for(int x:arr){
            l=Math.max(l,x);
            h+=x;
        }
        
        while(l<=h){
            int mid=l+(h-l)/2;
            
            int painter=minBoards(arr, mid);
            if(painter<=k){
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
        int arr[]={5,10,30,20,15};
        int k=3;
        System.out.println(minTime(arr,k));
    }
}
