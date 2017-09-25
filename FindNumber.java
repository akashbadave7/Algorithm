package com.bridgeit.Programs;
import java.util.Scanner;
import com.bridgeit.Utility.*;
public class FindNumber 
{
    public static void main(String[] args) 
    {
    	Utility u = new Utility();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of k");
    	int k = s.nextInt();
        int n = (int) Math.pow(2, k);
        System.out.println("Think of an integer between "+0+" "+(n-1));
    	System.out.println("Guess the number");
    	int guess = s.nextInt();
        int secret = u.search(guess,0, n);
        System.out.println("Your number is\n"+secret);
        s.close();
    }
}


