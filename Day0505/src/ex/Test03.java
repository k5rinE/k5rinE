package ex;

public class Test03 {

	public static void main(String[] args) {
		//	C cc = new C();						//A에 상속을 받았기때문에 
		//	System.out.println(cc.a);			// a 출력가능
		
		C cc = new C(10, 20, 30);
		System.out.println(cc.a);
	}

}

class A {
	
	public A() {}
	int a=1;
	public A(int a) {
		this.a = a;
	}
	void testA() {
		System.out.println("testA");
	}
	void test() {
		System.out.println("testA");
}
}

class B extends A{
	int b=2;
	public B() {}
	public B(int a, int b ) {
		super(a);									//
		this.b=b;
	}
	void testB() {
		System.out.println("testB");
	}
		void test() {
			System.out.println("testB");
	}
}
class C extends B{
	int c=3;
	public C() {}
	public C(int a, int b, int c) {
		super(a,b);									//a b받아씀
		this.c=c;								//생성자 여기C는 C
		
	}
	void testC() {
		System.out.println("testC");
		
	}
		void test() {
			System.out.println("testC");
	}

}