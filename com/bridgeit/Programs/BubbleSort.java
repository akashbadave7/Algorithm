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
    	Integer n = s.nextInt();
    	Integer array[] = new Integer [n];
    	System.out.println("Enter the array element");
    	for (int i=0;i<array.length;i++)
    	{
    		array[i] = s.nextInt();
    	}
    	System.out.println("Before sort:");
    	u.printArray(array);
    	System.out.println();   
        // sort function
    	u.bubbleSort(array);
        System.out.println("After sort:");
        // print array
        u.printArray(array);
        s.close();
	}
}
