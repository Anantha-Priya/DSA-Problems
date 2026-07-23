public class reverseString {
    public static void main(String[] args) {
        String str="PRIYA";
        //Convert string to character Array
        char[] charArray=str.toCharArray(); 
        int i=0, j=charArray.length-1;
        while(i<j){
            char temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
        //convert Character Array into String
        String reverse=new String(charArray);
        System.out.println(reverse);

    }
}
