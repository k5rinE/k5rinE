package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int sum =0;
		
		try {
			
			int num = sc.nextInt();
		int a = 10/num;
		
		} catch(Exception e) {
			e.printStackTrace();
		}finally { //어떤경우든 여기 지나가라 
			
		
		}
		
		
			
		
		
		
		
		for (int i= 0; i<=100; i++)
			sum += i;
		System.out.println("sum = " + sum);
	}

}
