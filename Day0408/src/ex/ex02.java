package ex;

import java.util.Scanner;	 //if버전 가위바위보

public class ex02 { //이해됐다면 그냥 안보고도 짤수있어야함
					
	public static void main(String[] args) {
		int user, com, result;     //-> result 넣어주기
		System.out.println("가위(1),바위(2),보(3), 중 하나를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		user = Integer.parseInt(tmp);  	// 입력 받은 문자를(tmp) 숫자로 변환
		
		
		com = (int)(Math.random()*3)+1;  // 1,2,3 중 하나가 com에 저장됨
		
		System.out.println("당신은 "+ user + "입니다.");
		System.out.println("컴은 "+ com + "입니다.");
		
		result = user-com;
		
		if(result == 1 || result == -1)
			System.out.println("당신은 졌습니다.");
		else if(result ==1 || result == -2)
			System.out.println("당신은 이겼습니다.");
		else if (result == 0)
			System.out.println("비겼습니다.");
		

	}

}
