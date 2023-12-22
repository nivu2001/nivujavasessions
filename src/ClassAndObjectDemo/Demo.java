package ClassAndObjectDemo;

public class Demo {


		    
		    //class is called User define
		    //blue print or template-->properties(attributes)(Data members) and behaviors(Methods)
		    
		    //OOPS concept
		    //1.Data members(normal data or static data)()
		        //a.class variables b.local variables c.static variables d.final variables
		    //2.Methods(Normal methods or static methods)
		    //3.static data
		    //4.constructors
		    
		    //1.class variables or global variables
		    
		    
		    
		    
		    
		    
		    //class variables or global variables
		    
		    int a=20;
		    int b=30;
		    final int c=40;
		    static int d=50;
		    static int e;
		    
		    
		    /*
		     * syntax of method
		     * 
		     * 
		     * data_type method_name()
		     * {
		     *             body//statements
		     * 
		     * }
		     * 
		     * 
		     * int float double String short byte long char,boolean,...
		     * void 
		     * 
		     * 
		     * 
		     */
		    
		    
		    void add()
		    {
		        
		        //local variables
		        int first=90;
		        int second=30;
		        
		        int sum=first+second;
		        System.out.println(sum);
		        
		        
		    }
		    
		   
		    
		    public static void main(String[] args) {
		        
		        //syntax of object
		        //classname obj_name=new classname();
		            Demo obj=new Demo();
		        
		            System.out.println(obj.a);
		        
		            System.out.println(obj.b);
		            
		            System.out.println(obj.c);
		        
		            System.out.println(d);
		            
		            obj.add();
		            
		            
		            System.out.println(e=100);
		        
		   
		



	}

}
