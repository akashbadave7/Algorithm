package com.bridgeit.Programs;
import com.bridgeit.Utility.*;
public class MonthlyPayment
{
	public static void main (String[] args) 
	{
		Utility u = new Utility();
		double  p = Double.parseDouble(args[0]);
		double  y = Double.parseDouble(args[1]);
		double  r = Double.parseDouble(args[2]);
		u.monthlyPayment(p,y,r);
	}    
}