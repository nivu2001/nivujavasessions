package JavaPracriceSessions;

public class PracticeConditionalStatements {

	public static void main(String[] args) {
		 
		int a=30;
		int b=30;
		int sum=a+b;
		System.out.println("The addition of a and b is : "+sum);
		if(a>b)
		{
			System.out.println("The value of a is greater than b");
			
		}
		else 
		{
			System.out.println("The value of a is smaller than b");
			
		}
		
		//if else if statements
		
		if(a>b)
		{
			System.out.println("The value of a is greater than b");
			
		}
		else if(a<b)
		{
			System.out.println("The value of a is smaller than b");
			
		}
		else if(a!=b)
		{
				System.out.println("The value of a is not equal to b");
				
		}
		else
		{
			System.out.println("cannot determine the result");
		}
		
		//switch case statements
		
		 int days=7;
		System.out.println("The number of days in a week is 7:");

		switch(days)
	
		{
		  case 1:
			
			System.out.println("Sunday");
			break;
		 case 2:
			  System.out.println("Monday");
			   break;
			
		 case 3:
			System.out.println("Tuesday");
			break;

		 case 4:
			System.out.println("Wednesday");
			break;
	
		 case 5:
		
			System.out.println("Thursday");
			break;
		
		 case 6:
			 
			System.out.println("Friday");
			break;
			 
		 case 7:
			 
			System.out.println("Saturday");
			break;
			 

		 default:
			System.out.println("No value found");
			break;
			
		
		}		
		}
	}



}
