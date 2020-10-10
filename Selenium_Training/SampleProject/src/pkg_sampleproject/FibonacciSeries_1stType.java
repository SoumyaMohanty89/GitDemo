package pkg_sampleproject;

public class FibonacciSeries_1stType { // To print 0 1 1 2 3 5 8 13

	
	public static void main(String[] args) {
		
		//FibonacciSeries fobj = new FibonacciSeries();
		//fobj.fibonacci();
		
		fibonacci(10);
		//System.out.println(fib);

	}
	
	public static int fibonacci(int num)
	{
		int fib1=0, fib2=1,fibo=0;
		
		System.out.print(fib1+" "+fib2+" ");
		
		for(int i=1;i<=num;i++)
		{
			fibo=fib1+fib2;
			fib1=fib2;
			fib2=fibo;
			
			System.out.print(fibo+" ");
		}
		
		return fibo;
	}

}
