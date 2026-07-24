// code - "deco" is anagram but  cede is not an anagram

class anagram {
    public static boolean areAnagrams(String s1, String s2) {
        //creating count array
        int [] count=new int[26];
        
        for(char c:s1.toCharArray()){
            count[c-'a']++;
        }
        
        for(char c:s2.toCharArray()){
            count[c-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;     
            }
        }
    return true;   
        
    }

    public static void main(String[] args) {
        String x="code";
        String y="deco";
        boolean result=areAnagrams(x, y);
        System.out.println(result);
    }
}