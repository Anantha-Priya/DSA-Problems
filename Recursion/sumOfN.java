public class sumOfN{
    static int sum(int n){
        if(n==0){
            return 0;      // Base case: sum of 0 is 0
        }
        return n+sum(n-1);     // Recursive step: add current 'n' to the sum of (n-1)
    }

  public static void main(String[] args){
    int result=sum(5);
    System.out.println(result);
  }   
}
