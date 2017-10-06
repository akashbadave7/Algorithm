package com.bridgeit.Programs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.bridgeit.Utility.*;
class PrimeAnagram 
{
	/**
	 * @param args
	 */
	public static void main(String args[]) 
	{
		try{
			Utility u = new Utility();
			PrimeAnagramUtility pau = new PrimeAnagramUtility ();
			ArrayList<Integer> primeArray = new ArrayList<Integer>();
			ArrayList<Integer> anagarmArray = new ArrayList<Integer>(); 
			Scanner scanner = new Scanner (System.in);
			System.out.println("Enter the starting value:");
			int start = scanner.nextInt();
			System.out.println("Enter the Last value:");
			int limit = scanner.nextInt();
			Integer[] array=u.disp(start,limit);
			u.printArray(array);
			for (Integer ele : array)
			{
				primeArray.add(ele);
			}
			@SuppressWarnings("unchecked")
			ArrayList<Integer> primenumbers = PrimeAnagramUtility.palindromNumber(array);
			for(Integer ele : primenumbers)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
			anagarmArray = PrimeAnagramUtility.findAnagram(primeArray,anagarmArray,primenumbers);
			PrimeAnagramUtility.printArrayElement(primeArray,anagarmArray);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}