package ex;

public class P430 {

	public static void main(String[] args) {
		method1();
	}
static void method1() {
	try {
		throw new Exception();
	} catch (Exception e) {
		System.out.println(" 예외처리");
		e.printStackTrace();
	}
}
}
