package pkg_sampleproject;

public class Factorial_level1 {

	public static void main(String[] args) {
		int i;
		int num=5;
		int fact=1;
		
		for(i=1;i<=num;i++){
			
			fact=fact*i;
		}
		System.out.println("The factorial is : "+fact);

	}

}
