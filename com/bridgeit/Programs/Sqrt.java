package com.bridgeit.Programs;
import com.bridgeit.Utility.*;
public class Sqrt 
{
	public static void main (String[] args) 
	{
		Utility u = new Utility();
		double c = Double.parseDouble(args[0]); 
		double t = c;
		double epsilon = 1e-15;
		double res = u.sqrt(c,t,epsilon);
		System.out.println(res);
	}  
}