package conditionalstatementsconcept.com;

public class NestedifelseDemo2 {

	public static void main(String[] args) {
		
        int num=75;
        if( num < 100 )
        { 
           System.out.println("The entered number is less than 100"); 
           if(num > 50)
           {
	          System.out.println("The entered number is greater than 50");
	       }
	    }
	    else
	    {
	        System.out.println("The entered number is greater than 100");
	    }
	}

}
