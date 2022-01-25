//Week3
//Challenge: Day2
//Question1
//Stack

import java.util.Scanner;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int[] maxArray;
    private int top;
    private int maxtop;

    public Stack(int size){
        maxSize = size;
        maxArray = new int[maxSize];
        stackArray = new int[maxSize];
        maxtop = 0;
        top = -1;
    }

    public void push(int ele){
        if(top > maxSize)
            System.out.println("Stack is Full");

        stackArray[++top] = ele;

        if(top==-1)
            maxArray[++maxtop] = ele;

        if(ele > maxArray[maxtop])
            maxArray[++maxtop] = ele;
    }

    public int pop(){
        if(top == -1)
            System.out.println("Stack is Empty");

        if(maxArray[maxtop] == stackArray[top])
            return maxArray[maxtop--];

        return stackArray[top--];
    }

    public void getMax()
    {
        if(top==-1)
            System.out.println("Stack is Empty!");
        System.out.println(maxArray[maxtop]);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of operations you want to undergo:");
        int ch = s.nextInt();
        s.nextLine();
        Stack stack = new Stack(ch);
        System.out.println("Enter " + ch + " operations:");

        for(int i = 0; i < ch; i++){
            String str = s.nextLine(); // "1 90", "2", "1 20"
            String[] strArr = str.split(" ");
            int[] numArr = new int[strArr.length];

            for(int j=0; j <strArr.length; j++)
                numArr[j] = Integer.parseInt(strArr[j]);

            if(numArr[0] == 1)
                stack.push(numArr[1]);

            else if(numArr[0] == 2)
                stack.pop();

            else if(numArr[0] == 3)
                stack.getMax();

            else
                System.out.println("Invalid Choice!");
        }
    }
}