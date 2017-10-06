package com.bridgeit.Programs;
import java.io.IOException;

import com.bridgeit.Utility.*;
public class BinarySearch 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Utility u = new Utility();
			u.readFile();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured.");
		}
	}
}
