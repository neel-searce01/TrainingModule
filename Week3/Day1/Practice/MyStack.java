public class MyStack
{
    private int maxSize;        
    private long[] stackArray;
    private int top;            
    
    public MyStack(int s)         
    {
        maxSize = s;             
        stackArray = new long[maxSize];  
        top = -1;                }
    
    public void push(long j)        {
        if(!this.isFull())
            stackArray[++top] = j;
        else
            System.out.println("Stack full");
    }
    
    public long pop()           
    {
        if(this.isEmpty())
            return -1;
        else
            return stackArray[top--];
    }
    
    public long peek()         
    {
        if(!this.isEmpty())
            return stackArray[top];
        else
            return -1;
    }
    
    public boolean isEmpty()    
    {
        return (top == -1);
    }
    
    public boolean isFull()     
    {
        return (top == maxSize-1);
    }

    public void display()
    {
        if(!this.isEmpty())
            for(int i=top;i>=0;i--)
                System.out.println(stackArray[i]);
        else
            System.out.println("Stack is Empty");
    }

    public static void reverse(MyStack s){
        if(!s.isEmpty()){
            long temp = s.pop();
            reverse(s);
            push_bottom(s,temp);
        }
    }
    private static void push_bottom(MyStack s,long val){
        if(s.isEmpty())
            s.push(val);
        else{
            long temp = s.pop();
            push_bottom(s,val);
            s.push(temp);
        }
    }
}  
class StackApp
{
    public static void main(String[] args)
    {
        MyStack theStack = new MyStack(10);  
        theStack.push(20);               
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.display();

        theStack.reverse(theStack);
        System.out.println("NEW");
        theStack.display();

//        theStack.pop();
//        theStack.push(10);
//        System.out.println("pop"+theStack.pop());
//        theStack.display();

//        while( !theStack.isEmpty() )     
//        {                             
//            long value = theStack.pop();
//            System.out.print(value);      
//            System.out.print(" ");
//        }  
//        System.out.println("");
    }  
}  