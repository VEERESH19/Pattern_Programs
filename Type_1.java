package com;

import java.util.Scanner;

class Type_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//Output

/*
Enter a number: 
5
*****
*****
*****
*****
*****
*/
