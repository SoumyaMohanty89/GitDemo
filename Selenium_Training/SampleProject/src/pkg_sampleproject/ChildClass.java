package pkg_sampleproject;

public class ChildClass extends ParentClass{
	
	int z;

	public void multiplication(int a, int b){
		z=a*b;
		System.out.println("The multiplication of two numbers is "+z);
	}
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.addition(10, 20);
		obj.substraction(20, 10);
		obj.multiplication(10, 10);
		

	}

}
