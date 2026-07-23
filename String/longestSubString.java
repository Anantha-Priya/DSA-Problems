import java.util.Arrays;

public class longestSubString {
    public static void main(String[] args){
        String[] strs={"came","campus","camera","camp"}; //all words in array is lowercase
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int index=-1;
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            index=i;
        }
        if(index==-1){
            System.out.println("");
        }
        else{
            System.out.println(first.substring(0,index+1));
        }   
    }
}
