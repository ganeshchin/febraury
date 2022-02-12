package logics;

public class Example6 {
	 static int x=10;
	 static int y=20;
	 int z;
	 int a;


	public static void main(String[] args) {
		Example6 ex=new Example6();
		System.out.println(Example6.x);
		System.out.println(Example6.y);
		System.out.println(ex.z);
		System.out.println(ex.a);
		ex.m1();

	}
public void m1() {
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
}
}
