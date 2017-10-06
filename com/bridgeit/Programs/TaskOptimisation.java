package com.bridgeit.Programs;

import java.util.Scanner;
import com.bridgeit.Utility.*;


public class TaskOptimisation 
{
	public static void main(String[] args) 
	{	
		Utility u = new Utility();
		
		Scanner scanner = new Scanner(System.in);	//	scanner to get input
		
		System.out.print("Enter Number of tasks: ");
		int count = scanner.nextInt();	//	number of tasks
		
		int[] deadlineArray = new int[count];	//	array to store deadlines
		int[] timeArray = new int[count];	//	array to store time required for each task
		
		//	gets tasks data
		for(int i = 0; i < count; i++) 
		{
			System.out.print("Enter deadline and time required for the task number :" + (i+1) + " ");;
			deadlineArray[i] = scanner.nextInt();
			timeArray[i] = scanner.nextInt();
		}
		scanner.close();
		//	orders tasks in ascending order of deadline 
		u.insertionSortAsc(deadlineArray,timeArray);
		
		//	prints the tasks
		u.doTask(count,timeArray);
	}

}