package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class PrimeNumber 
{
	public static void main(String args[])
	{
		Utility u = new Utility();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting value");
		int start = s.nextInt();
		System.out.println("Enter limit value");
		int limit = s.nextInt();
		u.finfPrimeNum(start,limit);
		s.close();
	}
}
