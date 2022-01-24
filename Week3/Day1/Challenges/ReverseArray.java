//Week3
//Challenge: Day1
//Question1
//Reverse Array
import java.util.Scanner;
public class ReverseArray{
    static void rev(int arr[], int i){ //Static function for reversing and printing the array
        int[] arr1 = new int[i];
        int j = i;
        for(int z = 0; z < i; z++){
            arr1[j - 1] = arr[z];
            j = j -1;
        }

        System.out.println("Reversed Array is: ");
        for(int k = 0; k < i; k++){
            System.out.println(arr1[k]);
        }
    }

    public static void main(String[] args){

        int num;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the number of elements you want to enter: ");
        num = s.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter " + num + " elements to reverse it: ");
        for(int i = 0; i < num; i++)
            arr[i] = s.nextInt();
        rev(arr, arr.length);
    }
}