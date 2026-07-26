class killingSpree{
    static int maxPeopleDefeated(int p) {
       long l=1, h=(long) Math.sqrt(p);         //Math.sqrt() returns answer in double so we to type cast to long
        long ans=0;
        
        while(l<=h){
            long mid=l+(h-l)/2;
            
            long sumOfSquares=((mid*(mid+1)*((2*mid)+1))/6);
            
            if(sumOfSquares<=p){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return (int) ans;

    }

    public static void main(String[] args) {
        int s=30;     //strength of ours
        System.out.println(maxPeopleDefeated(s));
    }
}