package ex;

public class ex04 {

	public static void main(String[] args) {
 //3) 함수에서 입력x 출력 O
		double dnum = 2.5;
		int num2 = 5;
		// short n = (short)num;  -> 위에 함수를 맞춰서 넘겨줘야함 
		System.out.println("main() 함수!!"); 
		
		double n = sub(); //함수 호출    --> 인자 int result 추가
		
		System.out.println("결과 값은" + n);
		
	}
	//함수가 존재하면 반드시 다른 곳(main통에서) 호출해야한다
	// void(반환형) 자리에는 반환형이 온다 --> void는 반환값이 없다는 것을 맹시
	// sun는 함수 이름 --> 변수이름 준에서 명명한다.
		//public static void sub() { //--> 매개변수
		public static double sub() { //--> 매개변수 void-->int 로 변환 10000의 값을 뽑기위해
		double dnum = 12.5;
		System.out.println("sub() 함수...");
		
		return dnum;
	}

}
