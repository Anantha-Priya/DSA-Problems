//Adding into the list -> the last ones which gets added will be the first ones to be removed.
// Stack represents Last-in-first-out (LIFO) of stack objects.

//The Stack class is extension of vector, where vector class implements the growable array obect like an array. 
// Vector is a Thread-Safe Implementation

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();

        stack.push("Priya");
        stack.push("Sandy");
        stack.push("Pinky");
        stack.push("Kutty");                  
    //When the size is set to 3 then it will allow only that elements and then if we try to push some more elements then it will discard the remainig elements
        stack.setSize(3);
        
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
set