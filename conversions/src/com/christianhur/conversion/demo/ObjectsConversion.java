package com.christianhur.conversion.demo;

public class ObjectsConversion {

	public static void main(String[] args) {
		A a = new C();
		B b = new B();
		C c = new C();
		
		a = c;
		
		show(a);
		show(b);
		show(c);
	}
	static void show(A a) {
		a.print();
	}
//	static void show(B b) {
//		b.print();
//	}
//	static void show(C c) {
//		c.print();
//	}
}
class A{
	void print() {System.out.println("A");}
	void bet() {System.out.println("Bet A");}
}
class B extends A{
	void print() {System.out.println("B");}
}
class C extends B{
	void print() {System.out.println("C");}
}