package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class VendingMachine 
{

	public static void main(String[] args) 
	{	
		Utility u = new Utility();
		Scanner s = new Scanner(System.in);
		int notes[] = {1,2,5,10,50,100,500,1000};
		System.out.println("Enter the amount:");
		int change = s.nextInt();
		int len = notes.length;
		int count = u.findCount(notes,change,len);
		System.out.println("Number of notes to be returns : " +count );
		s.close();
	}
}
