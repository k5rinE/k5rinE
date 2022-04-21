package OperatePractice;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
System.out.println("점수입력 ㄱ");
		int point = 0;
		Scanner sc = new Scanner(System.in); //화면을 통해 입력받은 내용을 tmp에 저장
		point = sc.nextInt();  //입력받은 문자열(tmp)을 숫자로 변환
		
		//90A 80B 70C 60D F
		
		switch(point/10) {    //점수가 90이라면 10을 나누어 정수만 해당되니 이런식으로 해결가능
		case 9 :{
			System.out.println("A");}
		break;
		case 8 :{
			System.out.println("B");}
		break;
		case 7 :{
			System.out.println("C");}
		break;                              //76점이라면 탈출시킴
		case 6 :{
			System.out.println("D");}
		break;
		default:
			System.out.println("F");}
		
		}
		
	}


