package com.bridgeit.Programs;
import java.util.*;
import com.bridgeit.Utility.*;
public class ToBinary
{	
	public static void main(String args[])
	{
		Utility u = new Utility();
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		u.convertBinary(str,num);
		scan.close();
	}
}