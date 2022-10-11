package com.greatlearning.driver;
import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int noOfTrans;
		int target;
		
		System.out.println("Enter the number of transaction in an array");
		noOfTrans = sc.nextInt();
		
		int [] transArray = new int [noOfTrans];
		System.out.println("Enter the transaction: ");
		
		for (int i = 0; i< noOfTrans; i++)
		{
		transArray[i] = sc.nextInt();
		}
		System.out.println("what is the target needed to be achieved?");
	    target = sc.nextInt();
	    
	    int checkvar = 0;
	    int idx = 1;
	    boolean checkCond = false;
	    for (int i = 0; i < noOfTrans; i++)
	    {
	    	checkvar += transArray [i];
	    	idx += i;
	        if (checkvar >= target)
	        {
	        	System.out.println("Target is Achieved After" + idx + "Transactions");
	        	checkCond = true;
	        	break;
	        }
	    }
	    if (checkCond == false)
	    	System.out.println("Target is not Achieved");
	        }
	    
	}
	
	
	

	
