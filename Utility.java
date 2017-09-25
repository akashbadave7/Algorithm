package com.bridgeit.Utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility 
{
	//SORTING logics
	//Binary Search Interger
	public void binarySearchInt(int arr [], int key)
    {
       int low,high,mid;
  	   low=0;
  	   high=arr.length-1;
  	   
  	   while(low<=high)
  	   {
  		   mid=(high+low)/2;
  		   if(key == arr[mid])
  		   {
  			 System.out.println("Number "+key+" Found at position "+(mid+1));
  		     break;
  		   }
  		   else if (key > arr[mid])
  		   {
  			   low = mid+1;
  		   }
  		   else
  		   {
  			   high = mid-1;
  		   }
  	   }
    }
	//Binary Search String
	public void binarySearchStr(String arr[], String str)
    {
		boolean found=false;
		int pos=0;
		for (int i=0;i<arr.length;i++)
		{
			if(str.equalsIgnoreCase((arr[i])))
			{
				found=true;
				pos = i+1;
				break;
			}
		}
		if(found == true)
		{
			System.out.println("Word is found at position "+pos);
		}
		else
		{
			System.out.println("Word not found");
		}
	  
    }
	
	//Insertion Sort Integer
	public void insertionSortInt(int arr[])
	{
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr that are greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
	}
	
	////Insertion Sort String
	public void insertionSortStr(String str[])
	 {
		 for(int i=1;i<str.length;i++)
			{
			    String val=str[i];
			    int j=i-1;		
			    while(j>=0 && (str[j].compareTo(val))>0)
			    {
		                str[j+1]=str[j];
			            j--;
			    }
			    str[j+1]=val;
			}
	 }
	
	//BubbleSort Ineteger
	public void bubbleSortInt(int arr[])
	{
		int n = arr.length;
		for (int i=0 ; i<n ; i++)
		{
			for (int j=i+1 ; j<n ; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	//BubbleSort string
	public static void bubbleSortStr(String str[])
	{
		int n = str.length;
		for (int i=0 ; i<n ; i++)
		{
			for (int j=i+1 ; j<n ; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
	}
	
	//Merger Sort Integer
	
	public void merge_sort (int a[] , int lo , int hi )
	{
		if( lo < hi ) 
	    {
			// defines the current array in 2 parts .	  
			int mid = (lo + hi ) / 2;
			// sort the 1st part of array .
			merge_sort (a,lo,mid);
			 // sort the 2nd part of array.
	        merge_sort (a,mid+1,hi);             
	        // merge the both parts by comparing elements of both the parts.
	        merge(a,lo,mid,hi);   
	   }                    
	}
	public void merge(int a[] , int start, int mid, int end) 
	{
		 //stores the starting position of both parts in temporary variables.
		int p = start ,q = mid+1;
		int arr1[] = new int[end-start+1];
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
			else if( a[p]<a[q])     
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
			  a[start++] = arr1[ l ] ;                          
		}
	}
	// TO print array
	public void printArray(int arr[])
	{
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//ANAGRAM
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
	

	public void readFile() throws FileNotFoundException 
	{
		File file = new File("D:/Akash/Algorithm/com/bridgeit/Programs/BinarySearchString");
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
	// to guess number using binary search
    public int search(int guess,int low, int high) {

    	if ((high - low) == 1) return low;
        int mid = low + (high - low) / 2;
        System.out.print("Is it less than "+mid+"? ");
        boolean ans = false;
        if (guess<mid) 
        {
        	System.out.println(!ans);
        	return search(guess,low, mid);
        }
        else
        {
        	System.out.println(ans);
        	return search(guess,mid, high);
       	}
    }
    
    ///Monthly Payment
    public void monthlyPayment(double p,double y,double r)
	{
		double  n = 12*y;
		double  rate = r/(12*100);
		double  payment = (p*rate)/(1-Math.pow(1+rate,-n));
		System.out.println(payment);
	}
    
    //PrimeAnagram
    
    public void disp(int start, int limit)
	{
		Scanner s = new Scanner(System.in);
		int arr[] = new int[limit/2]; 
		int k=0,len = 0;
		// find prime number between range 
		for (int i=start;i<=limit;i++)
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
            if (arr[i] != 0)
                len++;
        }
        // to store prime number in array
        int [] newArray = new int[len];
        for (int i=0, j=0; i<arr.length; i++)
        {
            if (arr[i] != 0) {
                newArray[j] = arr[i];
                j++;
            }
        }
        System.out.println();
        //to print prime numbers
        for(int i=0;i<newArray.length;i++)
		{
				System.out.print(newArray[i]+ " ");
		}
        System.out.println();
        //to find palindrom and anagram
        System.out.println("Anagram and palindrome prime numbers are:");
        for(int i=0;i<newArray.length;i++)
        {
        	int num = newArray[i];
        	int temp = num;
        	int sum=0;
        	while (temp!=0)
        	{
        		int rem = temp%10;
        		sum = (sum*10)+rem;
        		temp = temp/10;
        	}
        	if (num == sum)
        	{
        		System.out.print(num+" ");
        	}
        }
	}
    
    //FindPrimeNumber
    public void finfPrimeNum(int start, int limit) 
	{
		// TODO Auto-generated method stub
		int arr[] = new int[limit/2]; 
		int k=0,len = 0;
		// loop until last number
		for (int i=start;i<=limit;i++)
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
	        if (arr[i] != 0)
	            len++;
	    }
	    
	    int [] newArray = new int[len];
	    for (int i=0, j=0; i<arr.length; i++)
	    {
	        if (arr[i] != 0) {
	            newArray[j] = arr[i];
	            j++;
	        }
	    }
	    System.out.println();
	    for(int i=0;i<newArray.length;i++)
		{
				System.out.print(newArray[i]+ " ");
		}
	}
    
    //Sqrt
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
}
