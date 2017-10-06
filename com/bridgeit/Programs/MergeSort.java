package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class MergeSort 
{
	public static void main(String args[])
	{	
		Utility u = new Utility();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		Integer n = s.nextInt();
		Integer arr[] = new Integer[n];
		System.out.println("Enter the array element");
		for (int i=0 ; i<arr.length ; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Before sort:");
		u.printArray(arr);
		u.mergeSort(arr,0,n-1);
		System.out.println("After sort:");
		u.printArray(arr);
		System.out.println();
		s.close();
	}
}
