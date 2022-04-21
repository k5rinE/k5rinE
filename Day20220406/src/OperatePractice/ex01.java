package OperatePractice;

public class ex01 {

	public static void main(String[] args) {
		
		int num = 4000; //4000초 -->시 분 초
		
		int h = num/3600;
		int m = (num/60)-60;
		int s = num - (h*3600) - (m*60);
		
	
		System.out.println(h + "시" + m + "분" + s + "초");

		int bb = num%7;   //% 연산하고 남은 나머지를 표기
		
		System.out.println(bb);
		System.out.println("-----------------------------------------");
		System.out.println("샘의 답안지");
		
		
				
	}

}
