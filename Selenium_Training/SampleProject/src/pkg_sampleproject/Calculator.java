package pkg_sampleproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator { //switch case
	
	public int calculation(String operation){
		int a=50;
		int b=30;
		int result=0;
		System.out.println(operation);
		
	switch(operation){
	case "addition":
		result= a+b;
		break;
	case "substraction":
		result= a-b;
		break;
	case "multiplication":
		result = a*b;
		break;
		
	default:
		System.out.println("Please enter valid operation");
		break;
	}
	
	return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Please enter an operation to proceed :");
		String operation = br.readLine();
		Calculator obj = new Calculator();
		System.out.println(obj.calculation(operation));
	}

}
