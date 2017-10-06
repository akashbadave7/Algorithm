package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class Binary 
{
	public static void main(String args[])
	{
		Utility u = new Utility(); 
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		// to convert decimal to binary
		u.toBinary(str,num);
		scan.close();
	}
}