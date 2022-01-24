//Week3
//Challenge: Day1
//Question2
//LinkedList
import java.util.Scanner;
class List{ //Creating a class in order to create a DataSpace which will hold the value of the node and address of the next node, too.
    int data;
    List next;
    List(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    List head=null,temp;

    void insertNode(int data){ //First or Head Node will be inserted here
        if(head==null){
            head = new List(data);
        }
        else{ //Elements after head will be added after checking the condition
            temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = new List(data);
        }
    }

    void printList(){ //Function for printing the LinkedList
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

    int size(){ //Function to calculate the Size of the linkedList
        temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }


    public static void main(String[] args) { //Main Function

        LinkedList ll = new LinkedList(); //Initializing the LinkedList
        Scanner s = new Scanner (System.in); //Using Scanner Class to take input
        
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
