public class printPower {
    static int pow(int n,int p){
        if(p<=0){
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static void main(String[] args){
        int n=5;
        int p=3;
        int result=pow(n,p);
        System.out.println(result);
    }
}


// pow(5,3)
// = 5 * pow(5,2)
// = 5 * 5 * pow(5,1)
// = 5 * 5 * 5 * pow(5,0)   so we use return 1 in the if condition
// 5 * 5 * 5 * 0 = 0