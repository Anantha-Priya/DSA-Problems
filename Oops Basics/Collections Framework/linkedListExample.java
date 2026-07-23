import java.util.*;
public class linkedListExample{
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Priya");
        linkedList.addFirst("Kutty");
        linkedList.addLast("Chellam");
        for(int i=0;i<linkedList.size();i++){
                System.out.println(linkedList.get(i));
        }
        linkedList.remove(0);
        linkedList.removeFirst();                  //It will remove forrst element and return the removed element
        linkedList.peekFirst();                     //It will just return the first element
        Boolean present= linkedList.contains("Priya");
        System.out.println(present);
    }
}