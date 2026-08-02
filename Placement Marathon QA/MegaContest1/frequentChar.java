import java.util.*;

public class frequentChar {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        int[] freq=new int[256];
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c==' ') continue;
             freq[c]++;
        }
        
        char maxChar=' ';
        int maxCount=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                maxChar=(char)i;
            }
        }
        System.out.print(maxChar);
    }
}
