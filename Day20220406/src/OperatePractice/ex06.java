package OperatePractice;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) { 
		// 정수 입력받아서 90이상A 80B 70C 60D 60이하F
		
		Scanner sc = new Scanner(System.in); //-- 세트
		
		int num = sc.nextInt();              //--
		
		if(num >= 90 && num <=100)                   //; 안붙인다 왜지?
		System.out.println("A");        // 만점이 100점이다 라고 체크도 해줘야함
		
		else if(num >= 80)
		System.out.println("B");
		
		else if(num >= 70)
		System.out.println("C");
		
		else if(num >= 60)                                                   
		System.out.println("D");
		
		else
		System.out.println("F");
		
	}

}
