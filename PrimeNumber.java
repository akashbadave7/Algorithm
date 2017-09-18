import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int limit = s.nextInt();
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
        s.close();
	}
}
