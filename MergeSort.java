import java.util.Scanner;

public class MergeSort 
{
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array element");
		for (int i=0 ; i<arr.length ; i++)
		{
			arr[i] = s.nextInt();
		}
		merge_sort(arr,0,n-1);
		System.out.println("After sort:");
		for (int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		s.close();
	}
	
	static void merge_sort (int a[] , int lo , int hi )
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
	static void merge(int a[] , int start, int mid, int end) 
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
}
