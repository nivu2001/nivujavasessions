package Javasessions.com;

public class StringDatatype {

	public static void main(String[] args) {
		        
		        String s="Welcome to Nucot";
		        System.out.println(s);
		        
		        
		        //Stringconcatenation
		        
		        int a=2;
		        int b=4;
		        System.out.println(a+b);//+ addition operator//6
		        String ss="Selenium";
		        String sss="Course";
		        System.out.println(ss+sss);//+ concatenation operator
		        
		        System.out.println(a+ss);//2Selenium
		        System.out.println(a+b+ss+sss);//6SeleniumCourse
		        System.out.println(ss+sss+a+b);//SeleniumCourse24
		        System.out.println(ss+sss+(a+b));//SeleniumCourse6
		        System.out.println(a+b+ss+sss+a+b);//6SeleniumCourse24
		        System.out.println(a+b+ss+sss+(a+b));//6SeleniumCourse6
		        
		        char c='a';
		        char cc='b';
		        System.out.println(c+cc);//97+98=195
		        
		        String ssss="Automation";
		        String sssss="Testing";
		        
		        System.out.println(c+cc+ssss+sssss);//195AutomationTesting
		        System.out.println(ssss+sssss+c+cc);//AutomationTestingab
		        System.out.println(ssss+sssss+(c+cc));//AutomationTesting195
		        System.out.println(c+cc+ssss+sssss+c+cc);//195AutomationTestingab
		        
		        System.out.println('a'+'b');
		        System.out.println('#'+'a');//35+97=132
		        //a-z,A-Z,0-9,others special characters
		        System.out.println('a');
		        System.out.println((byte)'#');//35
		        System.out.println((byte)'@');//64
		        System.out.println((byte)'}');//125
		        
		        //try with other data types with string //assignments
		        
		        short n=2;
		        short d=4;
		        System.out.println(n+d);//+ addition operator//6
		        String aa="Selenium";
		        String aaa="Course";
		        System.out.println(aa+aaa);//+ concatenation operator
		   
		        float y=2.5f;
		        float z=3.5f;;
		        System.out.println(n+d);//+ addition operator//7
		        String zzz="Nucot";
		        String zz="Institute";
		        System.out.println(zzz+zz);//+ concatenation operator
		   
		        double h=10.5;
		        double i=11;
		        System.out.println(h+i);//+ addition operator//7
		        String gg="Nucot";
		        String ggg="Institute";
		        System.out.println(gg+ggg);//+ concatenation operator
		   
		        
		        
		        
		        
		        
		        
		        
		   
	}

}
