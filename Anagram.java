import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		// To read input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string:");
		// Read first string
		String str1 = s.nextLine();
		System.out.println("Enter second string:");
		// Read second string
		String str2 = s.nextLine();
		// compute length of string
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
		s.close();
	}

}
