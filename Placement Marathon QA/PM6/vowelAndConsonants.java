import java.util.*;

public class vowelAndConsonants {
    static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        ArrayList<Character> vowels=new ArrayList<>();
        ArrayList<Character> consonants=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            char ch=sc.next().charAt(0);
            
            if(isVowel(ch))
              vowels.add(ch);
            else
               consonants.add(ch);
        }
        for(char ch:vowels)
           System.out.print(ch+" ");
        
        for(char ch:consonants)
           System.out.print(ch+" ");
    }
}
