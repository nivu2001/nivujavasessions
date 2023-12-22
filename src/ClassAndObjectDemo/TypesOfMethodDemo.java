package ClassAndObjectDemo;

public class TypesOfMethodDemo {
	
		    int a=10;
		    //Two types of methods
		    
		    //1.Normal method-->different ways
		    //2.Static method-->different ways
		    
		    //1.Normal method-->different ways
		    
		    //1.a.No input and No return type
		    
		    /*
		     * data_type method_name()
		     * {
		     *             statement
		     * }
		     * 
		     * 
		     */
		    
		    
		    
		    void test1()
		    {
		        System.out.println("Test1 method");
		        
		    }
		    
		    //2.a.No input but some return type
		    
		        /*
		         * data_type method_name()
		         * {
		         *             statement
		         * }
		         * 
		         * 
		         * int , float byte short double long char.....
		         * 
		         */
		    
		    
		    
		        
		        public int test2()
		        {
		            System.out.println("Test2 method");
		            
		            int a=10;
		            int b=10;
		            int sum=a+b;
		            
		            return sum;
		            
		        }
		public String companyName()
		        {
		            System.out.println("Company Name is ");
		            
		            String name="Nucot software";
		            return name;
		            
		            
		        }
		        
		        
		        
		        
		    
		        //3.a.Some input and some return type
		        
		            /*
		             * data_type method_name(String username,String password)
		             * {
		             *             statement
		             * }
		             * 
		             * 
		             * int , float byte short double long char.....
		             * 
		             */
		            
		        
		        
		        
		            public String test3(String userName)
		            {
		                System.out.println("Test2 method");
		                
		                String un=userName;
		        
		                return un;
		                
		            }
		            
		            
		            public int add(int a,int b)
		            {
		                System.out.println("Addition of two numbers");
		                
		                int sum=a+b;
		        
		                return sum;
		                
		            }
		        
		            
		    
		            
		            //4.a.some input but no return type
		            
		            /*
		             * data_type method_name(String username,String password)
		             * {
		             *             statement
		             * }
		             * 
		             * 
		             * int , float byte short double long char.....
		             * 
		             */
		            
		            
		            
		            
		            public void test4(String userName)
		            {
		                System.out.println("Test2 method");
		                String un=userName;
		                System.out.println(un);
		        
		                
		            }
		            
		            
		            public void add1(int a,int b)
		            {
		                System.out.println("Addition of two numbers");
		                
		                int sum=a+b;
		        
		                System.out.println(sum);
		                
		            }    
		            
		            
		        
		    
		    public static void main(String[] args) {
		        
		        //create the object
		        
		        //syntax
		        //class_name obj_name=new class_name();
		        
		        TypesOfMethodDemo obj=new TypesOfMethodDemo();
		        
		        System.out.println("*****No input and No return type******");
		        
		        System.out.println(obj.a);
		        obj.test1();
		        
		        
		        
		        System.out.println("*****No input and some return type******");
		        
		        int result=obj.test2();
		        System.out.println(result);
		        
		        
		        String compName=obj.companyName();
		        System.out.println(compName);
		        
		        
		        
		        System.out.println("**********Some input and some return type********");
		        
		        String un1=obj.test3("Nucotsoftware");
		        System.out.println(un1);
		        
		        
		        
		        
		        
		        int res=obj.add(2, 5);
		        System.out.println(res);
		        
		        
		        
		        System.out.println("*********some input but no return type*********");
		        
		        obj.test4("Modi");
		        
		        
		        obj.add1(6,6);
		        
		        
		        
		        
		        
		    }
		}

	

