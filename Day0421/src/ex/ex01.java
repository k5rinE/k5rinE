package ex;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		
		// 세 정수를 입력받아서 최대값 출력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자3개 입력");
		int num1, num2, num3;
		
		int max;
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			max = num1; }
			
	else if (num2>= num1 && num2 >= num3) {
			max=num2;}
		
	else { 
		max=num3; }
	
	System.out.println("최대값"+ max);
	}
		
	}
	
	 
	


