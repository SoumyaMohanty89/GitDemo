package pkg_sampleproject;

public class SubClass extends SuperClass {
	int z=20;
	public void display(){
		
		System.out.println("We are executing the method of sub class");
	}
	
	public void myMethod(){
		super.display();
		display();
		System.out.println("The value of the variable inside super class is : "+super.z);
		System.out.println("The value of the variable inside sub class is : "+z);
	}

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.myMethod();
		

	}

}
