package ex;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		System.out.println("나이 ㄱ");
		Scanner sc = new Scanner(System.in);
		int x = 2500;
		int age = sc.nextInt();
		
		
		if(age>=0 && age<=3) {
			System.out.printf("%d세 요금 %d원" , age, (int)(x*0));
		}
		else if(age>=4 && age<=13) {
			System.out.printf("%d세 요금  %d원" , age, (int)(x*0.5));
		}
		else if(age>=14 && age<=19) { // 조건식을 조금 최적화 할 수있음
			System.out.printf("%d세 요금 %d원" , age, (int)(x*0.75));
		}
		else if(age>=65)  {
			System.out.printf("%d세 요금 %d원" , age, (int)(x*0));
		}
		else if (age>=20 && age <= 64)  {
			System.out.printf("%d세 요금 %d원" , age, (int)(x));
		}
		
	}

}
