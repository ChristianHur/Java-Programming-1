package com.christianhur.conversion.demo;

public class NumbersConversion {
	
	static double sum(double a, double b, double c) {		
		return (a+b+c);
	}	
//	static int    sum(int a, int b, int c) {		
//		return (a+b+c);
//	}	
//	static int    sum(byte a, short b, int c) {		
//		return (a+b+c);
//	}

	public static void main(String[] args) {
		
		double 	d = 1.0;	//	8 bytes	
		float 	f = 1.0F;	//	4 bytes		
		long 	l = 1L;		//	8 bytes
		int 	i = 1; 		//	4 bytes		[00000000 00000000 00000000 00000000]
		char	c = 'A';	//	4 bytes		ASCII Values 0-255
		short 	s = 1;  	//	2 bytes		[00000000 00000000]
		byte 	b = 1;  	//  1 byte		[00000000]
				
		p( (int)sum(s,s,s) );
		
		
		
		
		
		
		
		
		
		
		
		
		{d = d+f+l+i+c+s+b;}
	}
	static void p(Object obj) {
		System.out.println(obj.toString());
	}
}







