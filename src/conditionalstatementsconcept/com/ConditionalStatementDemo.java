package conditionalstatementsconcept.com;

public class ConditionalStatementDemo {

	
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=200;
		//System.out.println(a==b);
		
		//if statement
		
		/*
		 * if(condition)
		 * {
		 * statements
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("**********If  satement**************");
		//a=10 b=2
		
		if(a>b)
		{
			
			System.out.println("A is greater");
			
		}
		
		System.out.println("Thanks");
		
		System.out.println("**********If esle satement**************");
		//if else statement
		//a=10 b=1
		
		//if else statement
		
				/*
				 * if(condition)
				 * {
				 * 				statements
				 * 
				 * }
				 * else
				 * {
				 * 				statements
				 * }
				 * 
				 * 
				 * 
				 * 
				 */
		if(a<b)
		{
			System.out.println("A is lesser than B");
			
			
		}
		else
		{
			System.out.println("A is greater than B");
		
		}
		
		
		System.out.println("**********Comparing the strings**************");
		String s1="Selenium";
		String s2="API";
		
		if(s1.equals(s2))
		{
			System.out.println("Both are equal");
			
		}
		else
		{
			System.out.println("Both are not equal");
			
			
		}
		
		System.out.println("Thanks");
		
		
		
		
		

	}

}
