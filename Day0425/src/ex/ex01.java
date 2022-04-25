package ex;

public class ex01 {

	public static void main(String[] args) {
		Variables var = new Variables(); //-->객체생성부터
		var.iv++;
		var.cv++;
		System.out.println("var1 : " + var.iv);
		System.out.println("var1_cv : " + var.cv);  //클래스 변수는 객체 생성하지 않고 접근가능 이유는 객체생성 전에 메모리 공간 올림
		
		Variables var2 = new Variables(); //-->객체생성부터
		var2.iv++;
		var2.cv++;
		System.out.println("var2 : " + var2.iv);
		System.out.println("var2_cv : " + var2.cv); //->공유되서 증가된값이 적용
		
		Variables var3 = new Variables(); //-->객체생성부터
		var3.iv++;
		var3.cv++;
		System.out.println("var3 : " + var3.iv);
		System.out.println("var3_cv : " + var3.cv); //->공유되서 증가된값이 적용
		
		Variables var4 = new Variables();  //-->객체 생성해줘야 사용가능
			System.out.println(var4.iv);
			
	}
	

}

class Variables {
	int iv; //->개별변수,멤버변수
	static int cv; //->값이공유 클래스변수,공유변수
	
	void method() {
		int lv=0; //지역변수
	}
}