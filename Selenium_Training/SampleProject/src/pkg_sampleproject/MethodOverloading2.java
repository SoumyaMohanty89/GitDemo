package pkg_sampleproject;

public class MethodOverloading2 { //method overloading with different datatypes

	private int addition(int a,int b){
		return a+b;
	}
	
	private double addition(double a,double b){
		return a+b;
	}
	public static void main(String[] args) {
		
		MethodOverloading2 obj = new MethodOverloading2();
		System.out.println(obj.addition(10.1, 11.2));
		System.out.println(obj.addition(10, 11.2));
		System.out.println(obj.addition(10, 11));
		

	}

}
