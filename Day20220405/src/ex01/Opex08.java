package ex01;

import java.util.Scanner; //결과창에서 입력해야 반응

public class Opex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 문자 'a' : 문자열 : "korea"
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>"); //
		
		String input = scanner.nextLine();
		ch = input.charAt(0);        			//아디 글자 겟수
		
		if('0'<=ch && ch <='9') { // 0~9면  밑에 문구 찍힌다
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a'<= ch && ch<='z')||('A'<=ch && ch <='Z')) { //소문자 랑 대문자 둘중아무거나 들어가면 밑에문구 출력
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
		
	}
}
