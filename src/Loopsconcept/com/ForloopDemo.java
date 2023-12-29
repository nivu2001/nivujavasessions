package Loopsconcept.com;

public class ForloopDemo {

	public static void main(String[] args) {
		
		
		//forloop
		//Variable_updation-->increment++/decrement --
		/*
		 * 
		 * /*_
				for(Variable_initialization;Variable_condition;Variable_updation)
				{
						//body or statements
				}
		
		*/
		 
		System.out.println("Numbers from 0 to 10 using for loop");
		
	
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			
		}
		
		
		System.out.println("Even Numbers from 0 to 10 using for loop");
		
		
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
			
		}
		
		
		System.out.println("Odd Numbers from 0 to 10 using for loop");
		
		
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
			
		}

/*
		
		System.out.println("infinite for loop");
		
		
		for(;;)
		{
			System.out.println("Wel come to nucot");
			
		}
		
*/		
		System.out.println("printing the small alphabets");
		
		for(char i='a';i<='z';i++)
		{
			
			System.out.println(i);
			
			
		}
		
		System.out.println("printing the capital alphabets");
		
		for(char i='A';i<='Z';i++)
		{
			
			System.out.println(i);
			
			
		}
		
		
		
		System.out.println("PyramidExample");
	
			for(int i=1;i<=5;i++)
			{ 
				
					for(int j=1;j<=i;j++)
					{  
							System.out.print("* ");  
					}  
					System.out.println();//new line  
			}  
			 
		
		
		
		
		
		
		
		
		

	}

}
