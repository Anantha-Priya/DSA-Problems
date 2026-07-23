// Built-in Methods in Collections Framework

import java.util.*;

public class collectionsExample {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(45);
        arrList.add(32);
        arrList.add(53);
        Collections.sort(arrList);
        System.out.println(Collections.min(arrList));
        System.out.println(Collections.max(arrList));
        System.out.println(arrList);
        Collections.reverse(arrList);
        System.out.println(arrList);
        Collections.rotate(arrList,2);
        System.out.println(arrList);




    }
}
