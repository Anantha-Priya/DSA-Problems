import java.util.*;
public class mapExample {
    public static void main(String[] args) {
        //Hash Map will not maintain the order in whihc we give
        HashMap<Integer, String> hashMap=new HashMap<>(); 
        hashMap.put(1,"Nandy");
        System.out.println(hashMap);
        hashMap.put(1,"Sindhu");
        // to avoid override use hashMap.putIfAbsent()
        hashMap.put(2,"Shiro");
        System.out.println(hashMap);
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.isEmpty());

        // The Tree Map maintains the sorted order
    }
}
