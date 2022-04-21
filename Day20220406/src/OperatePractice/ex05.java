package OperatePractice;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if(num > 0) 
			
			System.out.println("양수");
			System.out.println("정확합니다");
		
		if(num == 0)
			
		System.out.println("영");
		
		if(num < 0)
			
		System.out.println("음수");  // Ctrl+/ 누르면 해당줄 주석처리
		
		else if(num < 0);
		 System.out.println("음수");
		
		
		//else 특칭 책137
	}

}
