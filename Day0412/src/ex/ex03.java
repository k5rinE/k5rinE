package ex;

public class ex03 {

	public static void main(String[] args) {
		// 2) 함수에서 입력 o 출력 x
		
		double dnum = 2.5;
		int num2 = 5;
		// short n = (short)num;  -> 위에 함수를 맞춰서 넘겨줘야함 
		System.out.println("main() 함수!!"); 
		
		sub(dnum,num2); //함수 호출    --> 인자
		
		System.out.println("main()2 함수!!");
		
	}
	public static void sub(double i, int j) { //--> 매개변수
		System.out.println("두 수 합은" + (i+j));
		
		
	}
		//함수가 존재하면 반드시 다른 곳 (main등에서) 호출을 해야한다.
	//함수는 왜 만들까? 중복방지 수정한번에 컷 해버림, 이점이 많다
		
			
			
					

	}


