package ex01;

public class Opex03 {

	public static void main(String[] args) {
		
		double pi = 3.141592;					//3.142
		double shortPi = Math.round( pi * 1000);
		
		System.out.println(shortPi);
		
		shortPi = Math.round( pi * 1000); //round 소수점 첫번쨰 자리에서 반올림 정수로 돌림
		System.out.println(shortPi);
		
		shortPi = Math.round( pi * 1000)/1000.0;
		System.out.println(shortPi);
		

	}

}
