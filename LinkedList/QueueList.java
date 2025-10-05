package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueList {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

 
        // int searchNum= 1; 
        // System.out.println(queue);
        // System.out.println(queue.remove());
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // System.out.println("Do you have number "+ searchNum +" : " + queue.contains(searchNum));
        // System.out.println("Is your queue empty: " + queue.isEmpty());
        // System.out.println("Length of the queue is " + queue.size() );


        Stack<Integer> stack= new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println("Original Stack is: "+ stack);

        int[] reverseArray= new int[stack.size()];
        for(int i=0; i< reverseArray.length;i++){
            reverseArray[i]= stack.pop();
        }

        System.out.println("Your stack has been used to reverse an array: "+ Arrays.toString(reverseArray));


        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.remove(0));
        // System.out.println(stack);
  
    }
}
