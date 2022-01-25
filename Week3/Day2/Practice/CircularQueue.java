public class CircularQueue {
    private int[] arrQueue;
    private int rear;
    private int front;

    private int size;

    Queue(int s){
        rear = front = -1;
        size = s;
        arrQueue = new int[size];
    }

    public void push(int i){
        if(front == -1 && rear == -1){
            front = rear = 0;
        }
        else if(rear == size-1 && front != 0){
            rear = 0;
        }else if ((rear + 1) == front || (rear + 1) == size){
            System.out.println("Queue is full!");
            return;
        }
        else{
            rear++;
        }
        arrQueue[rear] = i;

    }

    public void pop(){

        if(front == -1 && rear == -1){
            System.out.println(("Queue is empty"));
            return;
        }
        System.out.println("\nElement " + arrQueue[front] + " popped");
        if(front == rear){
            front = rear = -1;
        }
        else if(front == size - 1){
            front = 0;
        }else{
            front++;
        }


    }
    public void printQueue(){
        if(front < rear){
            for (int i = front; i <= rear; i++) {
                System.out.print(arrQueue[i] + " ");
            }

            System.out.println();
        }
        else{
            for(int i = front; i < size; i++){
                System.out.print(arrQueue[i] + " ");
            }
            for(int i = 0; i <= rear; i++){
                System.out.print(arrQueue[i] + " ");
            }
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.printQueue();

      //  q.pop();
        System.out.println("Pushing 60 and 70: ");
        q.push(60);
        q.push(70);
        q.printQueue();

        q.pop();
        q.push(70);

        q.printQueue();

//        q.printQueue();

    }
}
