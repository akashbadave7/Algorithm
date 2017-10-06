package com.bridgeit.Programs;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.Utility.*;
public class UtilityFuction {

	public static void main(String[] args) 
	{
		Utility utility = new Utility ();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		Integer[] integerArray = new Integer[size];
		String [] stringArray = new String[size];
		System.out.println("Enter the integer type array");
		for (int i=0;i<integerArray.length;i++)
		{
			integerArray[i]=scanner.nextInt();
		}
		System.out.println("Enter the String type array");
		for (int i=0;i<stringArray.length;i++)
		{
			stringArray[i]=scanner.next();
		}
		
		utility.printArray(integerArray);
		utility.printArray(stringArray);
		
		System.out.println("Enter the number to find");
		int start= 0;
		int end = 0;
		int key = scanner.nextInt();
		
		start = (int) System.currentTimeMillis();
		utility.bubbleSort(integerArray);
		utility.binarySearch(integerArray, key );
		end = (int) System.currentTimeMillis();
		System.out.println("Time to search integer using binary search : "+(end-start)+" ms");
		
		System.out.println("Enter the word to find");
		scanner.nextLine();
		String string = scanner.nextLine();
		start = (int) System.currentTimeMillis();
		utility.bubbleSort(stringArray);
		utility.binarySearch(stringArray, string );
		end = (int) System.currentTimeMillis();
		System.out.println("Time to search char using binary search : "+(end-start)+ " ms");
		
		System.out.println("==============================================================");
		
		start = (int) System.currentTimeMillis();
		utility.insertionSort(integerArray);
		utility.printArray(integerArray);
		end = (int) System.currentTimeMillis();
		System.out.println("Time to sort integer array using insertionSort  : "+(end-start)+ " ms");
		
		
		System.out.println("==============================================================");
		
		start = (int) System.currentTimeMillis();
		utility.insertionSort(stringArray);
		utility.printArray(stringArray);
		end = (int) System.currentTimeMillis();
		System.out.println("Time to sort char array using insertionSort  : "+(end-start)+ " ms");
	
		System.out.println("==============================================================");
		
		start = (int) System.currentTimeMillis();
		utility.bubbleSort(integerArray);
		utility.printArray(integerArray);
		end = (int) System.currentTimeMillis();
		System.out.println("Time to sort integer array using bubbleSort  : "+(end-start)+ " ms");
		
		
		System.out.println("==============================================================");
		
		start = (int) System.currentTimeMillis();
		utility.bubbleSort(stringArray);
		utility.printArray(stringArray);
		end = (int) System.currentTimeMillis();
		System.out.println("Time to sort char array using bubbleSort  : "+(end-start)+ " ms");
	
	}

}
