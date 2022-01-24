import java.util.Scanner;
class List{
    int data;
    List next;
    List(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    List head=null,temp;

    void insertNode(int data){
        if(head==null){
            head = new List(data);
        }
        else{
            temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = new List(data);
        }
    }

    void printList(){
        temp = head;
        if(temp == null){
            System.out.println("Empty LinkedList");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }

    int size(){
        temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        Scanner s = new Scanner (System.in);
        
        System.out.print("Enter the number of elements you want to enter: ");
        int num = s.nextInt();

        System.out.println("Enter " + num + " elements in the LinkedList: ");
        for(int i = 0; i < num; i++)
            ll.insertNode(s.nextInt());
            
        ll.printList();
        System.out.println();
        System.out.println("Size of the LinkedList is: " + ll.size());

    }
}
