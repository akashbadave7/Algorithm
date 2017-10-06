package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class Anagram 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		// To read input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string:");
		// Read first string
		String str1 = s.nextLine();
		System.out.println("Enter second string:");
		// Read second string
		String str2 = s.nextLine();
		// compute length of string
		u.findAnagram(str1,str2);
		s.close();
	}
}
