
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) throws IOException
	{
		// to read file from system
		Scanner scanner = new Scanner(new File("/home/Ajit/Akash/Algorithm/Algorithm/src/input.txt"));
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
			System.out.println(arr[i]+" ");
		}
		// search particular word in array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be search.");
		String find = scan.nextLine();
		boolean found = false;
		for (int i=0;i<arr.length;i++)
		{
			if(find.equals(arr[i]))
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
		scanner.close();
		scan.close();
	}
}
