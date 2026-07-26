public class capacityToShip {
    static int calcNumDays(int[] weight,int capacity){
       int day=1;
       int sum=0;

       for(int w:weight){
          if(sum+w<=capacity){
            sum+=w;
          }else{
            sum=w;    //if sum exceed the capacity, comes to else block & reset sum to current weigth in array
            day++;
          }
        }
      return day;
    }
    static int shipWithInDays(int[] weight,int days){
        int l=0,h=0;
        for(int x:weight){
            l=Math.max(l,x);  // low -> Max of array
            h+=x;             // High -> Total weight in array
        }
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;

            int day=calcNumDays(weight,mid);
            if(day<=days){
                ans=mid;
                h=mid-1;        //If day is low then we need to ship smaller capacity to ship which may leads to increase the days
            }
            else{
                l=mid+1;
            }
        }
        return ans;      
    }
    public static void main(String[] args) {
        int[] weight={1,2,3,4,5,6,7,8,9,10};
        int days=5;

        System.out.println(shipWithInDays(weight,days));
    }
}
