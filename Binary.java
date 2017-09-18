import java.util.Scanner;

public class Binary 
{
	public static void main(String args[])
	{
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		// to convert decimal to binary
		toBinary(str,num);
		scan.close();
	}
	static void toBinary(String str, int num)
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
}