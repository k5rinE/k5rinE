package ex;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		
		// 세 정수를 입력받아서 순서대로 출력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자3개 입력");
		int num1, num2, num3;
		int max;
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		if (num2 > num1 ) {
			if (num2 >num3) {
				max= num2;
			
				if (num1 > num3) {
					med = num1;
					min = num3;		
				}
				
	else  {
		mex = num3;
		med	= num2
		min = num1;max=num1;
		num2=num3;
		num3=max;
	
		
	}
			max=num2;}
		
	else{    }
	
		{max=num1;
		num2=num3;
		num3=max;
	
	
	}
	
	
	
	System.out.println(num1 +","+ num2 +","+ num3);
	}
		
	}
	
	 
	


