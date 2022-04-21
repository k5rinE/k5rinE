package ex02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		string name = sc.nextLine();
		
		System.out.println(name);
		
		int num = sc.nextLine();
		
		System.out.println(num);*/
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		System.out.println(name);
		String input = sc.nextLine();
		 // 에러 정수 =문자열
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
