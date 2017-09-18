import java.util.Scanner;

class InsertionSort
{
    /*Function to sort array using insertion sort*/
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
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
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {   Scanner s = new Scanner(System.in);
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
    	sort(arr);
        System.out.println("After sort:");
        // print array
        printArray(arr);
        s.close();
    }
}