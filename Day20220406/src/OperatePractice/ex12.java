package OperatePractice;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in); //화면을 통해 입력받은 내용을 tmp에 저장
	    int user = sc.nextInt();  //입력받은 문자열(tmp)을 숫자로 변환
	    int com = (int)(Math.random()*3) + 1; //1,2,3중 하나가 com에 저장됨  이해를 하고 있는지 질문함
	    
	    System.out.println("당신은");
	}

}
