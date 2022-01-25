public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int[] maxArray;
    private int top;
    private int maxtop;

    public MyStack(int size){
        maxSize = size;
        maxArray = new int[maxSize];
        stackArray = new int[maxSize];
        maxtop = -1;
        top = -1;
    }

    public void push(int ele){
        if(top > maxSize)
        System.out.println("Stack is Full");
       
        stackArray[++top] = ele;

        if(top==-1)
        maxArray[++maxtop] = ele;
        
        if(data > maxArray[maxtop])
        maxArray[++maxtop] = ele;
    }

    public int pop(){
        if(this.isEmpty())
        return "Stack is Empty";

        if(maxArray[maxtop] == stackArray[top])
        return maxArray[maxtop--];
        
        return stackArray[top--];
    }
}
