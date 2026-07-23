// import java.util.Scanner;
// import java.util.Collections;
// import java.util.List;
// import java.util.ArrayList; Instead of importing all the packages separately we can combine it using ( * )
import java.util.*;

public class arrayListExample{
    public static void main(String[] args){
        //Collections -> List -> Array List & Linked List & Stack

        ArrayList<String> StringArrayList= new ArrayList<>();
            StringArrayList.add("Priya");
            StringArrayList.add("shiro");
            StringArrayList.add(1, "Abi"); 
            for(int i=0;i<StringArrayList.size();i++){
                System.out.println(StringArrayList.get(i));
            }
            StringArrayList.remove(2);
            StringArrayList.add("Abi");
            boolean present= StringArrayList.contains("shiro");
            int lastIndex= StringArrayList.lastIndexOf("Abi");
            System.out.println(present);
            System.out.println(lastIndex);
    }
}
