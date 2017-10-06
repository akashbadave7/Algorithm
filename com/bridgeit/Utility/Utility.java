package com.bridgeit.Utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility 
{
	//SORTING logics
	/**
	 * @param arr
	 * @param key
	 * @author Akash
	 * Binary Search Interger/String
	 */
	public <T extends Comparable<T>>void binarySearch(T arr[] , T key)
    {
       int low,high,mid;
  	   low=0;
  	   high=arr.length-1;
  	   boolean flag = false;
  	   while(low<=high)
  	   {
  		   mid=(high+low)/2;
  		   if(key.compareTo(arr [mid])==0)
  		   {
  			 System.out.println("Number "+key+" Found at position "+(mid+1));
  		     flag = true;
  			 break;
  		   }
  		   else if (key.compareTo(arr[mid])>0)
  		   {
  			   low = mid+1;
  		   }
  		   else
  		   {
  			   high = mid-1;
  		   }
  	   }
  	   if(flag == false)
  	   {
  		   System.out.println("Not Found");
  	   }
    }
	
	
	/**
	 * @param arr
	 * @author Akash
	 * Insertion Sort Integer/String
	 */
	public <T extends Comparable<T>> void insertionSort(T arr[])
	{
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            T key = arr[i];
            int j = i-1;
 
            /* Move elements of arr that are greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j].compareTo(key)>0)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
	}
	
	
	
	/**
	 * @param arr
	 * @author Akash
	 * BubbleSort Ineteger/String
	 */
	public <T extends Comparable<T>> void bubbleSort(T arr[])
	{
		int n = arr.length;
		for (int i=0 ; i<n ; i++)
		{
			for (int j=i+1 ; j<n ; j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					T temp = (T) arr[j];
					arr[j] = arr[i];
					arr[i] = (T) temp;
				}
			}
		}
	}	
	
	
	/**
	 * @param a
	 * @param low
	 * @param high
	 * @author Akash
	 * Merger Sort Integer
	 */
	public <T extends Comparable<T>> void mergeSort (T a[] , int low , int high )
	{
		if( low < high ) 
	    {
			// defines the current array in 2 parts .	  
			int mid = (low + high ) / 2;
			// sort the 1st part of array .
			mergeSort (a,low,mid);
			 // sort the 2nd part of array.
	        mergeSort (a,mid+1,high);             
	        // merge the both parts by comparing elements of both the parts.
	        merge(a,low,mid,high);   
	   }                    
	}
	
	/**
	 * @param a
	 * @param start
	 * @param mid
	 * @param end
	 * @author Akash
	 */
	public <T extends Comparable<T>> void merge(T a[] , int start, int mid, int end) 
	{
		 //stores the starting position of both parts in temporary variables.
		int p = start ,q = mid+1;
		Object[] arr1 = new Object[end-start+1];
		int k=0;
		for(int i = start ;i <= end ;i++) 
		{
			//checks if first part comes to an end or not .
			if(p>mid)      
		    {
		    	arr1[k++] = a[q++] ;
		    }
			//checks if second part comes to an end or not
			else if ( q > end)   
			{
			   arr1[k++] = a[p++];
			}
			//checks which part has smaller element.
			else if( a[p].compareTo(a[q])<0)     
			{
			   arr1[ k++ ] = a[p++];
			}
			else
			{
			   arr1[ k++ ] = a[q++];
			}
		}
		for (int l=0 ; l< k ;l ++)
		{
			  a[start++] = (T) arr1[ l ] ;                          
		}
	}
	
	/**
	 * @param array
	 * @author Akash
	 * TO print array
	 */
	public <T extends Comparable<T>> void printArray(T[] array)
	{
		for (int i=0 ; i<array.length ; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	//ANAGRAM
	/**
	 * @param str1
	 * @param str2
	 * @author Akash
	 * ANAGRAM
	 */
	public void findAnagram(String str1, String str2) 
	{
		int len1 = str1.length();
		int len2 = str2.length();
		int not_found=0;
		// checking both string are of same length or not
		if(len1==len2)
		{
			int len =len1;
			// repeat untill length of first string
			for(int i=0;i<len;i++)
			{
				int found=0;
				// repeat untill length of second string
				for(int j=0;j<len;j++)
				{
					// cheacking weather charactor is present or not
					if(str1.charAt(i)==str2.charAt(j))
					{
						found=1;
						break;
					}
				}
				// if charactor does not found
				if(found==0)
				{
					not_found=1;
				}
			}
			if(not_found==1)
			{
				System.out.println("string is not anagram");
			}
			else
			{
				System.out.println("String is anagram");
			}
		}
		else
		{
			System.out.println("Both string should be of same length.");
		}
	}
	
	//Binary
	
	/**
	 * @param str
	 * @param num
	 * @author Akash
	 * convert to binary
	 */
	public void toBinary(String str, int num)
	{
		int pow = 1;
	
		while (pow<=num/2)
		{
			pow *= 2;
		}
		while(pow>0)
		{
			if(num<pow)
			{
                str+=0;
            }
            else
            {
            	str+=1;
                num-=  pow;
            }
            pow/= 2;
		}
		System.out.println("Binary form is: " +str);
		swap(str);
	}
	
	// to swap nibbles
	/**
	 * @param str
	 * @author Akash
	 * to swap nibbles
	 */
	static void swap(String str)
	{
		if(str.length()<8)
		{
			while (str.length()<8)
			{
				str = "0" + str;
			}
		}
		else
		{
			while (str.length()<16)
			{
				str = "0" + str;
			}
		}
		char arr[] = str.toCharArray();
		for (int i=0;i<3;i++)
		{
			char ch = arr[i];
			arr[i]= arr[i+4];
			arr[i+4]= ch; 
		}
		str = String.valueOf(arr);
		System.out.println("After Swapping Nibbles:"+str);
		int c = Integer.parseInt(str);
		int decimal = 0;
		int power = 0;
		// to convert binary to decimal
		while(true)
		{
			if(c == 0)
			{
				break;
			}
			else 
			{
				int tmp = c%10;
				decimal += tmp*Math.pow(2, power);
				c = c/10;
				power++;
			}
		}
		System.out.println("Number after swapping Nibbles: " +decimal);
	}
	
	//BINARYSEARCHSTRING

	/**
	 * @throws FileNotFoundException
	 * @author Akash
	 * BINARYSEARCHSTRING
	 * reading from file
	 */
	public void readFile() throws FileNotFoundException 
	{
		File file = new File("/home/bridgeit/Akash/Algorithm/com/bridgeit/Programs/BinarySearchString");
		if(file.exists())
		{
			if(file.canRead())
			{
				Scanner scanner = new Scanner(file);
				// to read content of file
				String content = scanner.useDelimiter(" ").next();
				// to create array of string to store each word
				String arr[] = content.split(",");
				// to sort the array based on alphabetical order
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i].compareTo(arr[j])>0)
						{
							String temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
						}
					}
				}
				// to print array content
				for (int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				// find word in list
				findWord(arr);
			scanner.close();
			}
			else
			{
				System.out.println("Can't read file");
			}
		}
		else
		{
			System.out.println("File not Found");
		}
	}

	/**
	 * @param arr
	 * @author Akash
	 * find word from file
	 */
	public static void findWord(String[] arr) 
	{
		System.out.println();
		// search particular word in array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be search.");
		String find = scan.nextLine();
		boolean found = false;
		for (int i=0;i<arr.length;i++)
		{
			if(find.equalsIgnoreCase(arr[i]))
			{
				found=true;
				break;
			}
		}
		if(found == true)
		{
			System.out.println("Word is found");
		}
		else
		{
			System.out.println("Word not found");
		}
		scan.close();
	}
	
	//DAYOFTHEWEEK
	/**
	 * @param m
	 * @param d
	 * @param y
	 * @author Akash
	 * DAYOFTHEWEEK
	 * @return day of the week
	 */
	public int dayOfWeek(int m,int d,int y)
	{
		System.out.println("Entered date is : " +m+"/"+d+"/"+y);
		int y0 = y - (14 - m ) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12*((14 - m ) / 12) - 2;
		int d0 = ( d + x + 31*m0/12)%7;
		return d0;
	}
	
	//FInd number
	
	/**
	 * @param low
	 * @param high
	 * @author akash
	 * @author Akash
	 * guess your number
	 */
	public static void search(int low, int high) 
    {
    	Scanner scan = new Scanner(System.in);
    	
    	//if ((high - low) == 1) return low;
        int mid = low + (high - low) / 2;
        if(low<high)
        {
	        System.out.println("Is your number in between " + low +" "+ (mid) );
	        System.out.println("Press y for yes or n for no");
			if(scan.next().charAt(0)=='y')
			{
				search(low,mid);
			}
			else
			{
				search(mid+1,high);
			}
        }
        else
        {
        	System.out.println("The number is "+low);
        }
    }
    
    //Monthly Payment
    
    /**
     * @param p
     * @param y
     * @param r
     * @author Akash
     * Monthly Payment
     */
    public void monthlyPayment(double p,double y,double r)
	{
		double  n = 12*y;
		double  rate = r/(12*100);
		double  payment = (p*rate)/(1-Math.pow(1+rate,-n));
		System.out.println(payment);
	}
    
    //PrimeAnagram
    
    /**
     * @param start
     * @param limit
     * PrimeAnagram
     * @author Akash
     * @return  prime numbers
     */
    public Integer[] disp(int start, int limit)
	{
		Integer arr[] = new Integer[limit/2]; 
		int k=0,len = 0;
		// find prime number between range 
		for (int i=2;i<=limit;i++)
		{
			boolean prime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime==true)
			{
				arr[k]=i;
				k++;
			}
		}

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] != null)
                len++;
        }
        // to store prime number in array
        Integer [] newArray = new Integer[len];
        for (int i=0, j=0; i<arr.length; i++)
        {
            if (arr[i] != null) {
                newArray[j] = arr[i];
                j++;
            }
        }
        System.out.println();
        //to print prime numbers
        return (newArray);
       
        //to find palindrom and anagram
	}
    
    //FindPrimeNumber
    /**
     * @param start
     * @param limit
     * @author Akash
     */
    public void finfPrimeNum(int start, int limit) 
	{
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[limit/2]; 
		int k=0,len = 0;
		// loop until last number
		for (int i=2;i<=limit;i++)
		{
			boolean prime = true;
			// to check the number is prime or not
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			// to store each prime number in array
			if(prime==true)
			{
				arr[k]=i;
				k++;
			}
		}
	    for (int i=0; i<arr.length; i++)
	    {
	        if (arr[i] != null)
	            len++;
	    }
	    
	    Integer [] newArray = new Integer[len];
	    for (int i=0, j=0; i<arr.length; i++)
	    {
	        if (arr[i] != null) {
	            newArray[j] = arr[i];
	            j++;
	        }
	    }
	    System.out.println();
	   
	    printArray(newArray);
	}
    
    //Sqrt
	/**
	 * @param c
	 * @param t
	 * @param e
	 * @author Akash
	 * @return square root of number
	 */
	public double sqrt(double c, double t, double e)
	{
		while(Math.abs(t-c/t)>e*t)
		{
			t=(c/t+t)/2;
		}
		return t;
	}  
	
	// convert decimal to binary
		public void convertBinary(String str, int num)
		{
			int pow = 1;
		
			while (pow<=num/2)
			{
				pow *= 2;
			}
			while(pow>0)
			{
				if(num<pow)
				{
	                str+=0;
	            }
	            else
	            {
	            	str+=1;
	                num-=  pow;
	            }
	            pow/= 2;
			}
			System.out.println("Binary form is: " +str);	
		}
		
		//Vending Machine
		/**
		 * @param notes
		 * @param change
		 * @param len
		 * @author Akash
		 * @return numbers of notes to be return
		 */
		public int findCount(int notes[],int change,int len)
		{
			int count=0;
			// Traverse through all denomination
			for (int i=len-1; i>=0; i--)
			{
			  // Find denominations
				while(change >= notes[i])
				{
					change -= notes[i];
					System.out.print(notes[i]+" ");
					count++;
				}
			}
			System.out.println();
			return count;
		}
		
		//TASK OPTIMIZATION

		//	orders tasks in ascending order of deadline 
		/**
		 * @param deadlineArray
		 * @param timeArray
		 * @author Akash
		 */
		public void insertionSortAsc(int[] deadlineArray, int[] timeArray) 
		{
			for(int i = 1; i < deadlineArray.length; i++) {
				int deadlineKey = deadlineArray[i];
				int timeKey = timeArray[i];
				int j = i - 1;
				while((j > -1) && (deadlineArray[j] > deadlineKey)) {				
					deadlineArray[j+1] = deadlineArray[j];
					timeArray[j+1] = timeArray[j];
					j--;
				}
				deadlineArray[j+1] = deadlineKey;
				timeArray[j+1] = timeKey;
			}
		}
			
		/**
		 * @param count
		 * @param timeArray
		 * @author Akash
		 */
		public void doTask(int count, int[] timeArray) 
		{
			for(int i = 0; i < count; i++) 
			{
				System.out.println("Task " + (i+1) + ":" + timeArray[i]);
			}
		}
}
