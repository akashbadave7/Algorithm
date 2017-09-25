package com.bridgeit.Programs;
import com.bridgeit.Utility.*;
public class DayOfWeek
{
	public static void main (String[] args) 
	{
		Utility u = new Utility();
		String arr[] = {"Sun","Mon","Tue","Wed","Thus","Fri","Sat"};
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int res = u.dayOfWeek(m,d,y);
		System.out.println(arr[res]);
	}
}