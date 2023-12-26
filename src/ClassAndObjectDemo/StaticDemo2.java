package ClassAndObjectDemo;

public class StaticDemo2 {

	//static --variables,methods,blocks,nested classes
	//variables
	
	int a=10;
	static int b;
	
	//normal methods
	
	
	void test1()
	{
		System.out.println("Test-1");
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	
	//static method
	
	
	static void test2()
	{
		System.out.println("Test-2");
		//System.out.println(a);//normal variables cannot be used in static methods
		System.out.println(b);
		
	}
	
	
	//static block
	
	/*
	 * static
	 * {
	 * 
	 * 		//body/statements
	 * }
	 * 
	 * 
	 * 
	 */
	
	static
	{
		System.out.println("Welcome to static demo");
		//System.out.println(a);//normal variables cannot be used in static blocks
		System.out.println("The value of b in static block");
		b=20;
		
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Normal variables and method");
		
		StaticDemo2  obj=new StaticDemo2();
		obj.test1();
		System.out.println("The value of a is-->"+obj.a);
		
		
		System.out.println("Static variables and method");
		
		test2();
		
		StaticDemo2.test2();
		System.out.println("The value of b is first way-->"+b);
		System.out.println("The value of b is second way-->"+StaticDemo2.b);
		
		

	}

}
