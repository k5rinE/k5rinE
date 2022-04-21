package OperatePractice;

 import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// 키보드로 두 정수를 입력 받아서 , 총점과 평균을 구한다
		
		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in); //시발 좀외워
		
		String n1 = sc.nextLine();  // 결과창에 점수 넣을거다 머 이런 명령어
		String n2 = sc.nextLine();
		
		int num1 = Integer.parseInt(n1); // 점수 넣은걸로 뭐할거다
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2; // 넣은 데이터를 이렇게 연산할것이다.
		double aver = sum / 2.0; //소수점 있을수도 있으니 int 보다 더블이 나음
		
		System.out.println("합계 :" + sum+"평균 :" + aver);
		// 합계 : 출력뒤 결과값 넣는 방식
		
		//https://where-i-am.tistory.com/entry/JAVA-기본-입력-Scanner 
		//설명하는사이트
	}

}
