//  public class firstBadVersion {
//     int firstBadVersion(int n){
//         int l=1,h=n,ans=-1;

//         while(l<=h){
//             int mid=l+(h-l)/2;

//             if(isBadVersion(mid)){      // isBadVersion -> it's a methode given as default in  leetcode 
//                 ans=mid;
//                 h=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return ans;
//     }  
//     public static void main(String[] args) {
//         int n=7;
//         System.out.println(firstBadVersion(n));
//     }  
//  }
