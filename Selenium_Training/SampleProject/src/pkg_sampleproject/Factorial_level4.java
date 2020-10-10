package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_level4 { //returning value from method

	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Factorial_level4 obj = new Factorial_level4();
		//obj.factorial();
	int f;
	f = factorial();
	System.out.println("The factorial of the number is : "+f);
	
		

	}

    //private static int factorial() throws NumberFormatException, IOException
	public static int factorial() throws NumberFormatException, IOException
	{
		int i,num;
		int fact=1;
		
		InputStreamReader reader = new InputStreamReader(System.in); // takes input from system
		BufferedReader br = new BufferedReader(reader); // reads the input given by the system
		
		System.out.println("Enter the number to find the factorial : ");
		num=Integer.parseInt(br.readLine()); // conversion of String to integer
		
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		
		//System.out.println("The factorial of the number is : "+fact);
		return fact;

	}

	}


