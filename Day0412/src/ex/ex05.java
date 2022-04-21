package ex;

public class ex05 {

	public static void main(String[] args) { //5 , 10을 넣고 50을 뽑아내라


		
		System.out.println("main() 함수!!");
		
		int result =  sub(5 ,10);
		
		System.out.println("결과 값은  "  + result );
		
	}

	public static int sub(int a, int b) {
		
		int result = a*b;
				
		System.out.println("sub() 함수...");
		
	return result;
	
}
}