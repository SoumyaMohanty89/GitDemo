package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_level5 { // Passing parameter in method

public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Factorial_level5 obj = new Factorial_level5();
		//obj.factorial();
	int f;
	int num;
	
	InputStreamReader reader = new InputStreamReader(System.in); // takes input from system
	BufferedReader br = new BufferedReader(reader); // reads the input given by the system
	
	System.out.println("Enter the number to find the factorial : ");
	num=Integer.parseInt(br.readLine()); // conversion of String to integer
	
	f = factorial(num);
	System.out.println("The factorial of the number is : "+f);
	
		

	}

    //private static int factorial() throws NumberFormatException, IOException
	public static int factorial(int num1) throws NumberFormatException, IOException
	{
		int i;
		//int num1;
		int fact=1;
		
		
		for(i=1;i<=num1;i++){
			fact=fact*i;
		}
		
		//System.out.println("The factorial of the number is : "+fact);
		return fact;

	}

	}



