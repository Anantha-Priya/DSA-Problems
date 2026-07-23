public class printNto1 {
    static void print(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        print(n-1); 
        // System.out.println(n);   if i put print statemnt below the recursive call then it will print 1 to N
    }
  public static void main(String[] args){
    print(5);
  }   
}


