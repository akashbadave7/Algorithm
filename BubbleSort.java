package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class BubbleSort 
{
	public static void main(String[] args) 
	{	// 
		Utility u = new Utility();
		Scanner s = new Scanner(System.in);
    	System.out.println("Enter the array size");
    	int n = s.nextInt();
    	int arr[] = new int [n];
    	System.out.println("Enter the array element");
    	for (int i=0;i<arr.length;i++)
    	{
    		arr[i] = s.nextInt();
    	}
    	System.out.println("Before sort:");
    	for (int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();   
        // sort function
    	u.bubbleSortInt(arr);
        System.out.println("After sort:");
        // print array
        u.printArray(arr);
        s.close();
	}
}
