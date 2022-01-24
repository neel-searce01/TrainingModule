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

    int sumNode(){
        temp = head;
        int sum = 0;
        while(temp!=null){
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    void insertAfterValue(int after,int val){
        temp = head;
        while(temp!=null){
            if(after == temp.data){
                List t2 = new List(val);
                t2.next = temp.next;
                temp.next = t2;
            }
            temp = temp.next;
        }
    }

    void insertFirst(int data){
        List n = new List(data);
        if(head!=null){
            n.next = head;
            head = n;
        }else{
            head = n;
        }
    }

    void removeFirst(){
        temp = head;
        if(head.next!=null)
            head = head.next;
        else
            head = null;
    }

    void removeLast(){
        temp = head;
        List pre = head;
        while(temp.next!=null) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
    }

    void deleteNode(int check) {
        temp = head;
        List pre = head;

        if(temp!=null) {
            if (temp.next == null && temp.data == check)
                head = null;
            else if (temp.data == check)
                head = head.next;
            return;
        }

        while(temp!=null){
            if(temp.data == check){
                pre.next = temp.next;
                break;
            }
            pre = temp;
            temp = temp.next;
        }
    }

    void append(LinkedList apList){
        temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = apList.head;
    }

    LinkedList copy(){
        LinkedList cpList = new LinkedList();
        temp = head;
        while (temp!=null){
            cpList.insertNode(temp.data);
            temp = temp.next;
        }
        return cpList;
    }

    LinkedList sublist(int p,int q){
        LinkedList sub = new LinkedList();
        temp = head;
        int i = 0;
        while (temp.next!=null){
            if(i>=p && i<q){
                sub.insertNode(temp.data);
            }
            temp = temp.next;
            i++;
        }
        return sub;
    }

    LinkedList concat(LinkedList list2){
        LinkedList conList = new LinkedList();
        temp = head;
        while(temp!=null){
            conList.insertNode(temp.data);
            temp = temp.next;
        }
        temp = list2.head;
        while(temp!=null){
            conList.insertNode(temp.data);
            temp = temp.next;
        }
        return conList;
    }

    void reverse(){
        List next=null,pre=null;
        temp=head;
        while (temp!=null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertNode(55);
        ll.insertNode(66);
        ll.insertNode(77);
        ll.insertNode(88);
        ll.insertNode(77);
        ll.insertNode(99);
        ll.printList();
        System.out.println();
        System.out.println(ll.size());
        System.out.println(ll.sumNode());




//        ll.reverse();
//        ll.printList();
//
//        LinkedList l2 = new LinkedList();
//        l2.insertNode(5);
//        l2.insertNode(27);
//        l2.printList();
//
//        System.out.println();
//
//        LinkedList newList = ll.concat(l2);
//        newList.printList();
//        DoublyLinkedList dll = new DoublyLinkedList();

    }
}
