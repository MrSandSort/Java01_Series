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
    }
}
