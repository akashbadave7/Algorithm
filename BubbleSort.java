import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{	// 
		Scanner s = new Scanner(System.in);
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
	/*Function to sort array using bubble sort*/
	public static void sort(int arr[])
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
	/* A utility function to print array of size n*/
	public static void printArray(int arr[])
	{
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
