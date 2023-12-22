package Javasessions.com;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {

		        //++ and --
		        
		        //post increment----> a++
		        //post decrement--->  a--
		        
		        //pre increment ---->  ++a
		        //pre decrement ---->  --a
		        
		        
		        //post increment
		        
		        /*
		         * a++--->  a
		         *             a+1
		         * 
		         * 
		         * 
		         */
		        
		        System.out.println("*****Post Incerment");
		        
		        int a=1;
		        int b=a++;
		        System.out.println(a);//2
		        System.out.println(b);//1
		        
		        
		        int aa=5;
		        int bb=aa++;
		        System.out.println(aa);//6
		        System.out.println(bb);//5
		        
		        int aaa=-98;
		        int bbb=aaa++;
		        System.out.println(aaa);//-97
		        System.out.println(bbb);//-98
		        
		        
		        System.out.println("*****Pre Incerment");
		        
		        /*
		         * ++p----> p+1
		         *             p    
		         * 
		         * 
		         * 
		         * 
		         */
		        
		        int p=1;
		        int q=++p;
		        System.out.println(p);
		        System.out.println(q);
		        
		        
		        
		        int pp=-59;
		        int qq=++pp;
		        System.out.println(pp);//-58
		        System.out.println(qq);//-58
		        
		        
		        //post decrement
		        
		        System.out.println("*****Post decerment");
		        int e=2;
		        int f=e--;
		        System.out.println(e);//1 
		        System.out.println(f);//2 
		        
		        int ee=-10;
		        int ff=ee--;
		        System.out.println(ee);//-11 
		        System.out.println(ff);//-10
		        
		        
		        //pre decrement
		        
		        
		        System.out.println("*****Pre decerment");
		        int h=2;
		        int j=--h;
		        System.out.println(h);//1 
		        System.out.println(j);//1 
		        
		        int hh=-11;
		        int jj=--hh;
		        System.out.println(hh);// -12
		        System.out.println(jj);//-12 
		        
		        
		        
		        
		        
		        
		        
		        

	}

}
