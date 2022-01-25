public class ListS{
    int data;
    ListS next;
    ListS(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    ListS head=null,temp;

    void push(int data){
        ListS newNode = new ListS(data);
        if(head!=null){
            newNode.next = head;
        }
        head = newNode;
    }

    void pop(){
        temp = head;
        if(head.next!=null)
            head = head.next;
        else
            head = null;
    }

    void display(){
        temp = head;
        if(temp == null){
            System.out.println("Empty Stack");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void reverse(){
        ListS next=null,pre=null;
        temp=head;
        while (temp!=null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
    }

    void printrev(ListS s){
        if(s==null)
            return;
        printrev(s.next);
        System.out.println(s.data);
    }


    public static void main(String[] args) {

        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        stack.printrev(stack);

//        stack.pop();
//        stack.display();
    }
}
