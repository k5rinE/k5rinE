package OperatePractice;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력해주세요.>");
	
		Scanner sc = new Scanner(System.in); //-- 세트
		String tmp = sc.nextLine(); 
		int num = Integer.parseInt(tmp);
		
		switch(num) {
		case 1: 
			System.out.println("1입력");      // break 가없다면 1의값일때 234 그외입력까지 다 입력됨
			break;
		case 2: 
			System.out.println("2입력");
			break;
		case 3: 
			System.out.println("3입력");		//break 없다면 34그외입력댐 break로 탈출시켜야 반복이 멈춤
			break;
		case 4: 
			System.out.println("4입력");
			break;                               
			default:
			System.out.println("그 외 입력");  //쭉 내려오다가 break 에서 탈출한다는 뜻 제어문
		}
	}
	

}
