import java.util.Scanner;

public class Utility 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		Utility u=new Utility();
		Utility v=new Utility();
		Utility w=new Utility();
		int arr[] = {50,40,30,20,10};
		int arr1[] = {5,4,3,2,1};
		String str[] =  {"E","D","C","B","A"};
		
		long s1 = System.currentTimeMillis();
		u.insertionSortInt(arr);
		u.binarySearchInt(arr, 50);
		long e1 = System.currentTimeMillis();
		
		long s2 = System.currentTimeMillis();
		v.bubbleSortInt(arr1);
		v.binarySearchInt(arr1, 5);
		long e2 = System.currentTimeMillis();
		
		long s3 = System.currentTimeMillis();
		u.insertionSortStr(str);
		u.binarySearchStr(str, "E");
		long e3 = System.currentTimeMillis();
		
		long s4 = System.currentTimeMillis();
		v.bubbleSortStr(str);
		v.binarySearchStr(str, "E");
		long e4 = System.currentTimeMillis();
		
		System.out.println((e1-s1));
		System.out.println((e2-s2));
		System.out.println((e3-s3));
		System.out.println((e4-s4));
	
	}
	public  static void binarySearchInt(int arr [], int key)
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
  
	public static void binarySearchStr(String arr[], String str)
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
	
	public static void insertionSortInt(int arr[])
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
	
	public static void insertionSortStr(String str[])
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

	public static void bubbleSortInt(int arr[])
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
}
