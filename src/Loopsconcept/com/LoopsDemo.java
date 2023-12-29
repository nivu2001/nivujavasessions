package Loopsconcept.com;

public class LoopsDemo {

	
	//While loop---minimum no of time while will execute --0
	//do while loop-minimum no of time while will execute --1
	//for loop
	//for each loop

	
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		
		//1.while loop
		
		/*
		 * syntax of while loop
		 * 
		 * while(condition)
		 * {
		 * 			body/statements
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		//0-----10------
		int num=5;
		int i=0;
		
		while(i<=num)
		{
			System.out.println("The value of-->"+i);//0 1 2 3 4 5
			i++;//i+1-->0+1=1   1+1=2  2+1=3    3+1=4     4+1=5  5+1=6-----.........
			
		}
		
		System.out.println("Thanks");
		
		
		//infinite while loop
	/*	
		while(true)	
		{
				System.out.println("Welcome to Taj");
		}
	
		*/
		
		System.out.println("****************The even numbers using while loop***************");
		int ii=2;
		int evenumbers=10;
		
		while(ii<=evenumbers)
		{
			System.out.println("even number are--->"+ii);
			
			ii=ii+2;
			
			
		}
		
		
		
		System.out.println("****************The even numbers using while loop***************");
		int iii=1;
		int oddnumbers=10;
		
		while(iii<=oddnumbers)
		{
			System.out.println("odd number are--->"+iii);
			
			iii=iii+2;
			
			
		}
		
		System.out.println("***************The sum of values to be calculated-->****************");
		int sum=0;
		int iiii=0;
		
		while(iiii<=10)
		{
			
			sum=sum+iiii;
			
			iiii++;
			
			
		}
		System.out.println("The sum of values are-->"+sum);
		
		
		
		
		
		

	}

}
