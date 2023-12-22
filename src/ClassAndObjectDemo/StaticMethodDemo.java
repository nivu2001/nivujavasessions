package ClassAndObjectDemo;

public class StaticMethodDemo {
	/*
     *         static    data_type method_name()
     *             {
     *                         body/statements
     * 
     *             }
     *
     * 
     * 
     */
    
    int a=20;
    
    static int b=30;
    
    
    static void show()
    {
        System.out.println("Show method");
    }
    
    
    //1.a.No input and No return type
    
    /*
     * data_type method_name()
     * {
     *             statement
     * }
     * 
     * 
     */
    
    
    
    static void test1()
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
    
    
    
        
        public static int test2()
        {
            System.out.println("Test2 method");
            
            int a=10;
            int b=10;
            int sum=a+b;
            
            return sum;
            
        }
        
        
        public static String companyName()
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
            
        
        
        
            public static String test3(String userName)
            {
                System.out.println("Test2 method");
                
                String un=userName;
        
                return un;
                
            }
            
            
            public static int add(int a,int b)
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
            
            
            
            
            public static void test4(String userName)
            {
                System.out.println("Test2 method");
                String un=userName;
                System.out.println(un);
        
                
            }
            
            
            public static void add1(int a,int b)
            {
                System.out.println("Addition of two numbers");
                
                int sum=a+b;
        
                System.out.println(sum);
                
            }
public static void main(String[] args) {
        
        StaticMethodDemo obj=new StaticMethodDemo();
        System.out.println(obj.a);
        //first way to exceute static data
        System.out.println(b);
        
        //Second way  static data
        //class_name.data_name;
         System.out.println(StaticMethodDemo.b);
        
        
        //first way to exceute static Method 
         show();
            
            //Second way  static data
            //class_name.method_name();
        StaticMethodDemo.show();
        
        
        
        System.out.println("*****No input and No return type******");
        
        System.out.println(b);
        test1();
        
        
        
        System.out.println("*****No input and some return type******");
        
        int result=test2();
        System.out.println(result);
        
        
        String compName=companyName();
        System.out.println(compName);
        
        
        
        System.out.println("**********Some input and some return type********");
        
        String un1=test3("Nucotsoftware");
        System.out.println(un1);
        
        
        
        
        
        int res=add(2, 5);
        System.out.println(res);
        
        
        
        System.out.println("*********some input but no return type*********");
        
        test4("Modi");
        
        
        add1(6,6);


	}

}
