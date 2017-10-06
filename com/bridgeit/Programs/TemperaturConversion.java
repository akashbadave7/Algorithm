package com.bridgeit.Programs;
import java.util.*;
public class TemperaturConversion 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double c,f;
		while(true)
		{
			System.out.println("Enter the choice:");
			System.out.println("1: Celsius to Fahrenheit.");
			System.out.println("2: Fahrenheit to Celsius.");
			System.out.println("press any key for exit.");
			int choice = scan.nextInt();
			switch (choice) 
			{			
			    case 1: // convert Celsius to Fahrenheit
			    		System.out.println("Enter the Temperature in celsius.");
						c = scan.nextDouble();
			    		f = (c*9/5) + 32;
			    		System.out.println("Temperature in Fahrenheit : "+f);
			    	 break;
			    	 	
			    case 2: // convert Fahrenheit to Celsius
			    		System.out.println("Enter the Temperature in Fahrenheit.");
						f = scan.nextDouble();
			    		c = (f-32)*5/9;
			    		System.out.println("Temperature in Celsius : "+c); 
			    	break;
			    default :
			    	return;
			}
		}
	} 
}