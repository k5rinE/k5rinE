package ex;
import java.util.*;
public class ex06dice {

	public static void main(String[] args) {
		
		
		int f = 0;
		do {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			
			System.out.printf("%d, %d =%d \n", num1, num2,(num1+num2));
			f=num1+num2;
			
		}while(f != 5);
		System.out.println("멈차");
		
}
}