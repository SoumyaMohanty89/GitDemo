package pkg_sampleproject;

public class Dog extends MethodOverriding{ //child class

	public void animals(){
		System.out.println("Animals can run and walk");
	}
	
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		obj.animals();
		obj.show();
		
		

	}

}
