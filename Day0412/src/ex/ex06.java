package ex;

public class ex06 {

	public static void main(String[] args) { //3 입력,출력
		
		int n = 5;
		int n2 =10;
		System.out.println("main() 함수!!");
		
		int result = sub(n, n2); // 결과값 리턴 받아주고 
		
		System.out.println("결과 값은 " + result); //결과 리턴 그대로 출력

	}
	public static int sub(int n, int n2) { //숫자를 받아와서
		
		System.out.println("sub () 함수");
		
		return n*n2; //여기서 돌림
	}
}
