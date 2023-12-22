package Javasessions.com;

public class DataTypesDemo {
	
	
	//Datatypes
	//1.Primitive Data Types:(Built in data types)
	
	//a.boolean type:-->true/false
	//b.Numeric Type:
		//1.a.character type:char
		//1.b.Integral Value:
				//1.Integer:-->byte,short,int,long
				//2.Floating-point:-->float,double
	
	
	//2.Non-Primitive Data Types:
	//Arrays,Object,String,Class,Interface---OOPS concept
	
	
	
	
	public static void main(String[] args)
	{
		
		//1.byte
		//size-->1byte--->8bits
		//range--->-128 to +127
		
		//variable
		//syntax--variable declaration
		//data_type variable_name;
		
		//syntax--variable init
		//data_type variable_name=value;
		
		
		System.out.println("*************This is byte datatype**********");	
		
		byte b=10;
		
		System.out.println(b);
		
		byte bb=40;
		System.out.println(bb);
		
		byte bbb=-128;
		System.out.println(bbb);
		
		byte bbbb=127;
		System.out.println(bbbb);
		bbbb=100;
		System.out.println(bbbb);
		
		
		//2.short:
		//size:2bytes---->2*8=16bits
		//range:-32768 to +32767
		
		System.out.println("*************This is short datatype**********");
		short s=200;
		System.out.println(s);
		
		short ss=-32768;
		System.out.println(ss);
		
		//short sss=32768;
		//System.out.println(sss);
		
		
		System.out.println("*************This is int datatype**********");
		
		//3.int
		//size:4bytes=4*8=32bits
		//range:-2147483648 to 2147483647
		
		int i=201;
		System.out.println(i);
		int ii=-2147483648;
		System.out.println(ii);
		
		int iii=2147483647;
		System.out.println(iii);
		
		
		System.out.println("*************This is long datatype**********");	
		
		//4.long
				//size:8bytes=8*8=64bits
				//range:-9223372036854775808 to 9223372036854775807
		
		long l=5000;
		System.out.println(l);
		
		
		long ll=-9223372036854775808l;
		System.out.println(ll);
		
		long lll=100l;
		
		System.out.println(lll);
		
		long llll=9223372036854775807l;
		System.out.println(llll);
		
		System.out.println("*************This is float datatype**********");
		
		//5.float
		//size:4bytes=4*8=32bits
		//range:after . takes upto 7digits 
		//first way
		float f=100.000f;
		System.out.println(f);
		//second way
		float ff=(float)200.000;
		System.out.println(ff);
		
		System.out.println("*************This is double datatype**********");
		
		//6.double
				//size:8bytes=8*8=64bits
				//range:after . takes up to 15digits 
				
		double d=123.00;
		System.out.println(d);
		double dd=000.000;
		System.out.println(dd);
		
		
		System.out.println("*************This is char datatype**********");
		//7.char
		//size:2bytes-->2*8=16bits
		//A-Z a-Z 0-9 special chars
		char c='a';
		System.out.println(c);
		
		char cc='$';
		System.out.println(cc);
		
		char ccc='8';
		System.out.println(ccc);
		
		
		System.out.println("*************This is boolean datatype**********");
		
		//8.boolen-->tyrue/false
		//size:1bit
		
		boolean t=true;
		System.out.println(t);
		
		boolean tt=false;
		System.out.println(tt);
		
		
		
		
		
		
		
		
	}
	

}
