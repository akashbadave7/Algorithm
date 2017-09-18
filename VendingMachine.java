import java.util.Scanner;

public class VendingMachine 
{

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		int notes[] = {1,2,5,10,50,100,500,1000};
		int change = s.nextInt();
		int len = notes.length;
		find(notes,change,len);
	}
	static void find(int notes[],int change,int len)
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
		System.out.println("Number of notes to be returns : " +count );
	}

}
