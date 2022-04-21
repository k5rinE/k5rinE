package ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		add(num1, num2);
		System.out.println("프로그램 종료");

	}
	//입력 출력 
	public static void add(int num1, int num2) {
		
		System.out.println("두 수 합은" + (num1+num2));
		
	}
}
