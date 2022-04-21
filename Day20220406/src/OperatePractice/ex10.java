package OperatePractice;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		System.out.println("현재 월을 입력하세요.>");
		
		Scanner sc = new Scanner(System.in); //-- 세트
		int month = sc.nextInt(); 
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
			
			//default:  //34567891011 제외한 모든숫자는 겨울로 취급            
		//case 12:
		//case 1:
		//case 2:
		case 12, 1, 2:
			System.out.println("현재의 계절은 겨울입니다.");
			//34567891011 제외한 모든숫자는 겨울로 취급
		break;
			default:  //13이상 숫자치면 개소리로 인식
				System.out.println("어느별에서 왔니?");
		}
		
		

	}

}
