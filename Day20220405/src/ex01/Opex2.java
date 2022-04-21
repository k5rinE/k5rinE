package ex01;

public class Opex2 {

	public static void main(String[] args) {
		float pi = 3.14159f; // 3.141
		float result = (int)(pi*1000) / 1000.0f; // int 문으로 정수로 전환 그전에 ()안에 pi*1000 넣어서 연산부터
		System.out.println(result);					// 3141 만들고 다시 천을 나누어 3.141 소수점자리 끈음.0f 넣자
		
		
		// 3.142 나오도록
		float result2 = (int)(pi*1000+0.5f) / 1000.0f;  //0.5 더한거
		
		System.out.println(result2);
	}

}
