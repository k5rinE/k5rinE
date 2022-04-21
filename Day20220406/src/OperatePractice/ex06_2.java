package OperatePractice;

import java.util.Scanner;

public class ex06_2 {

	public static void main(String[] args) { 
		
		
		Scanner sc = new Scanner(System.in); //-- 세트
		
		int num = sc.nextInt();         
		
		if (num > 0)
			System.out.println("양수"); //중첩가능
		
		else {
			
		if (num < 0)
			System.out.println("음수");
		else 
			System.out.println("영");

		}}
	}


