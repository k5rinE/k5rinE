package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		System.out.println("당신의 주민번호를 입력하세요. (011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7); //입력받은 번호의 8번쨰 문자를 gender에 저장
		
		switch(gender) {
		case '1' : case '3' :  //따옴표가 중요함 아스키코드냐 문자냐
			System.out.println("당신은 남자입니다");
			break;
		case'2' : case '4':
			System.out.println("당신은 여자입니다.");
			break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다");
		
		
		
		}	
	}
}
