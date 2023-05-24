package demo1;

import java.util.Scanner;

public class subarray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of arrays you need to enter");
		int n = scan.nextInt();
		int[]ar = new int[n];
		
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
	 for (int k = 1; k < ar.length; k++) 
	  {
		for (int i = 0; i <= ar.length-k; i++) 
		{
		  for (int j = i; j <k+i; j++) 
		  {
			  System.out.print(ar[j]+" ");
		  }	
		  System.out.println();
		}	
	  }

	}

}
