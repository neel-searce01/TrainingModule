public class Queue1
{
    private int maxSize;
    private int [] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue1(int s)
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item)   
    {
        if(rear == maxSize-1)         
            rear = -1;

        queArray[++rear] = item;         
        nItems++;                     
    }

    public int remove()         
    {
        int temp = queArray[front++]; 
        if(front == maxSize)          
            front = 0;
        nItems--;                      
        return temp;
    }
    
    public int peek()      
    {
        return queArray[front];
    }
    
    public boolean isEmpty()    
    {
        return (nItems==0);
    }
    
    public boolean isFull()     
    {
        return (nItems==maxSize);
    }
    
    public int size()           
    {
        return nItems;
    }

    public void reverse(Queue1 q){
        if(!q.isEmpty()){
            int temp = q.remove();
            reverse(q);
            q.insert(temp);
        }

    }
    public void display(Queue1 theQueue){
        System.out.println( "Size: " + theQueue.size());

        while( !theQueue.isEmpty() ) 
        { 

            long n = theQueue.remove(); 
            System.out.print(n);
            System.out.print(" ");
        }

    }

}


public class Queue
{
    public static void main(String[] args)
    {
        Queue1 theQueue = new Queue1(5); 
        theQueue.insert(10); 
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.display(theQueue);

        theQueue.insert(50); 
        theQueue.insert(60); 
        theQueue.insert(70);
        theQueue.insert(80);

        System.out.println("Revere: ");
        theQueue.reverse(theQueue);
        theQueue.display(theQueue);

        System.out.println(" ");
    } 
} 
        	  
        	  
