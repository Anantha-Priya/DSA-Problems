public class countDigit {
    static int count(int n){
        if(n==0){
            return 0;
        }
        int ld=n%10;
        n=n/10;
        return 1+count(n);
    }
    public static void main(String[] args) {
        int n=340945793;
        int result=count(n);
        System.out.println(result);
    }
}

