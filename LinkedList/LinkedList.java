package LinkedList;

public class LinkedList {

    Node head;

    public void reverse() {

        Node prev = null, curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {    // if list is empty--> pass the newNode as head element;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { // go to last node;
                temp = temp.next;
            }

            temp.next = newNode;  // attach new node at the end;
        }

    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void insertAt(int data, int position) {
        if (position == 1) {
            prepend(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of range");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public Node middleNode() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public Node kthNodeFromEnd(int k) {
        Node lead = head, follow = head;

        for (int i = 0; i < k; i++) {
            if (lead == null) {
                return null;
            }
            lead = lead.next;
        }

        while (lead != null) {
            lead = lead.next;
            follow = follow.next;
        }

        return follow;

    }

    public void removeKthFromEnd(int k) {
        if (k <= 0) return;   
        Node dummy = new Node(0);
        dummy.next= head;
        
        Node lead = dummy, follow = dummy;

        for (int i = 0; i < k + 1; i++) {

            if (lead == null) {
                head = dummy.next;
                return;
            }

            lead = lead.next;

        }

        while (lead != null) {
            lead = lead.next;
            follow = follow.next;
        }

        if (follow.next != null) {
            follow.next = follow.next.next;
        }

        head = dummy.next;
    }

}
