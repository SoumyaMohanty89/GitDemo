package pkg_sampleproject;

public class MethodOverloading1 { //method overloading with different in parameters
	
	public int addition(int a,int b){
		return a+b;
		
	}
	
	public int addition(int a,int b,int c){
		return a+b+c;
		
	}

	
	public static void main(String[] args) {
		
		MethodOverloading1 obj = new MethodOverloading1();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.addition(10, 20, 30));

	}

}
