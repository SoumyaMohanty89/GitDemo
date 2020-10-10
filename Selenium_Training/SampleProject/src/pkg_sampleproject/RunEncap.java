package pkg_sampleproject;

public class RunEncap extends EncapTest {

	
	public static void main(String[] args) {
		
		RunEncap obj = new RunEncap();
		obj.setName("Soumya");
		obj.setAge(20);
		obj.setSal(5000.00);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSal());
		
	}

}
