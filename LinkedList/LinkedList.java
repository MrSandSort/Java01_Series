package LinkedList;

    public class LinkedList {
      
     Node head;
     
     public void insert(int data){
        Node newNode= new Node(data);
        
        if(head==null){    // if list is empty--> pass the newNode as head element;
            head= newNode;
        }
        else{
            Node temp=head;
            while(temp.next!= null){ // go to last node;
                temp= temp.next;
            }

            temp.next= newNode;  // attach new node at the end;
        }

     }

     public void prepend(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head= newNode;
     }

     public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print( temp.value + "->");
            temp= temp.next;
        }

        System.out.println("null");
     }
    
     public void insertAt(int data, int position){
        if(position==1){
            prepend(data);
            return;
        }

        Node newNode= new Node(data);
        Node temp= head;

        for(int i=1; i< position-1 && temp!=null; i++){
            temp= temp.next;
        }

        if(temp== null){
            System.out.println("Index out of range");
        }

        newNode.next= temp.next;
        temp.next= newNode;
     }

    }