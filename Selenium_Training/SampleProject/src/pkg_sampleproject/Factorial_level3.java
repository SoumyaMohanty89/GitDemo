package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_level3 { //creating a method and calling in main()

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Factorial_level3 obj = new Factorial_level3();
		obj.factorial();
		

	}
	
	public void factorial() throws NumberFormatException, IOException
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
		
		System.out.println("The factorial of the number is : "+fact);

	}

	}


