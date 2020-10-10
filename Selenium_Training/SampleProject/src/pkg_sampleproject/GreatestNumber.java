package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestNumber {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		GreatestNumber obj = new GreatestNumber();
		
		obj.greatest();
		

	}
	
	public void greatest() throws NumberFormatException, IOException
	{
		int a,b,c;
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("Enter values of 1st number : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter values of 2nd number : ");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter values of 3rd number : ");
		c=Integer.parseInt(br.readLine());
		
		if(a>b && a>c)
		{
			System.out.println("Greatest is a : "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Greatest is b : "+b);
		}else
			System.out.println("Greatest is c : "+c);
	}

}
