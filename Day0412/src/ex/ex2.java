package ex;

public class ex2 {

	public static void main(String[] args) { // 함수에서 입력(X), 출력(X)
		System.out.println("main() 함수!!");   //순서1
		sub2(); //함수 호출
		
		System.out.println("main()2 함수!!"); //순서3
	}
		//함수가 존재하면 반드시 다른 곳 (main등에서) 호출을 해야한다.
	//함수는 왜 만들까? 중복방지 수정한번에 컷 해버림, 이점이 많다
		public static void sub() {
			System.out.println("서브 함수 입니다."); //순서2
			
		}
			public static void sub2() {
				sub();

				System.out.println("서브 함수2 입니다."); {//
					
					
				}
				
		}
	}


//