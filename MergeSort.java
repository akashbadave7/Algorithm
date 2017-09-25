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
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array element");
		for (int i=0 ; i<arr.length ; i++)
		{
			arr[i] = s.nextInt();
		}
		u.merge_sort(arr,0,n-1);
		System.out.println("After sort:");
		for (int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		s.close();
	}
}
