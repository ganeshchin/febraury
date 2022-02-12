package logics;

public class Test1 {
	public static void main(String[] args) {
	B b =new B();
	b.m2();
	b.m1();
	A a= new A();
	a.m1();
	
}}
class A{
	public void m1() {
		System.out.println("m1 method");
	}
}
class B extends A {
	public void m2() {
		System.out.println("m2 method");
	}
}