public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            next = prev = null;
            this.data = data;
        }
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);

        if(head == null && tail==null){
            tail = head = newNode;
         //   System.out.println("Head: " + head.data + " Tail: " + tail.data);
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;



    }

    public void insertLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;

            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;


    }

    public void reverse(){
        Node cur = tail;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.prev;
        }
    }

    public void display(){
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertFirst(50);

        //dll.display();
        dll.insertLast(60);
        dll.insertLast(70);
        dll.insertLast(80);
        dll.insertLast(90);
        dll.reverse();


    }
}
