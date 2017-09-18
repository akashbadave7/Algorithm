import java.util.*;

public class ToBinary
{	
	public static void main(String args[])
	{
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		toBinary(str,num);
		scan.close();
	}
	// convert decimal to binary
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
	}
}