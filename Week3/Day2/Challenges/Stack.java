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
        if(!this.isFull())
        stackArray[++top] = j;
        else
        System.out.println("Stack Full");
    }

    public int pop(){
        if(this.isEmpty())
        return -1;
        else
        return stackArray[top--];
    }
}
