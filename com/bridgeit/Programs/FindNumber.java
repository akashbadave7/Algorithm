package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class FindNumber 
{
    public static void main(String[] args) 
    {
    	Utility u = new Utility();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N");
    	int n = s.nextInt();
        System.out.println("Think of an integer between "+0+" "+(n-1));
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        u.search(0, n-1);
    }
}


