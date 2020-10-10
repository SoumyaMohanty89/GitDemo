package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries_2ndType {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		fibonacci();
		

	}
	
	public static void fibonacci() throws NumberFormatException, IOException
	{
		int fib1=0,fib2=1,fibo=0;
		
		
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter the number : ");
		
		int num =Integer.parseInt(br.readLine());
		
		System.out.print(fib1+" "+fib2+" ");
		
		for(int i=3;i<=num;i++)
		{
			fibo=fib1+fib2;
			fib1=fib2;
			fib2=fibo;
			
			System.out.print(fibo+" ");
		}
		
	}

	
}
