import java.util.*;
public class setExample {
    public static void main(String[] args){
        //Unordered Set (HASH)

        // HashSet<Integer> hashSet= new HashSet<>();
        // hashSet.add(334);
        // hashSet.add(34);
        // hashSet.add(34);
        // hashSet.add(35);
        // hashSet.add(35);
        // for(Integer ints: hashSet){
        //     System.out.println(ints);
        // }


        //Sorted Set (TREE)
        TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(334);
        treeSet.add(34);
        treeSet.add(34);
        treeSet.add(35);
        treeSet.add(35);
        for(Integer ints: treeSet){
            System.out.println(ints);
        }
        System.out.println(treeSet.ceiling(34));  //It returns least element in set greater than or equal to the given element.
        System.out.println(treeSet.floor(34));    //It returns least element in set lesser than or equal to the given element.

    }
}
