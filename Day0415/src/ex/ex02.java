package ex;

import java.util.*;

public class ex02 {

	public static void main(String[] args) {//선생님 답안
		
		
			int age;
			int fee = 1500;
			double rate = 0;
			age = (int)(Math.random()*120)+1;
			
			if(age>=65)
				rate =0.0;
			
			else if (age >= 20)
				rate = 1.0;
			
			else if (age >= 14)
				rate = 0.75;
			
			else if (age >= 4)
				rate = 0.5;
			
			else  
				rate = 0.0;
			
			System.out.println( " 나이 :" + age + " 최종요금 : "  + (int)(fee*rate)+"원");
			
	}

}
