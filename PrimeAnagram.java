package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;

class PrimeAnagram 
{
	public static void main(String args[]) 
	{
		Utility u = new Utility();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the starting value:");
		int start = scan.nextInt();
		System.out.println("Enter the Last value:");
		int limit = scan.nextInt();
		u.disp(start,limit);
        scan.close();
	}
}