package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(5);
        linkedList.insert(9);
        linkedList.insert(21);
    
        linkedList.display();

        linkedList.prepend(25);

        linkedList.display();

        // linkedList.reverse();

        // linkedList.display();

        System.out.println(linkedList.middleNode().value);

        linkedList.display();

        Node kth= linkedList.kthNodeFromEnd(4);

        System.out.println(kth.value);

        linkedList.removeKthFromEnd(2);

        linkedList.display();

    }
}
