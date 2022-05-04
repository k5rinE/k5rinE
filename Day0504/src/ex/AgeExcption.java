package ex;

import java.util.Scanner;

class ReadAgeExcption extends Exception{  //예외처리 최상위 상속클래스
	public ReadAgeExcption() {
		super("유효하지 않은 나이가 입력");
	}
}


public class AgeExcption {

	public static void main(String[] args) {
		System.out.println("나이 입력 : ");
		
		try {
			int age= readAge();
			System.out.println("입력된 나이 :"+ age);
		}catch(ReadAgeExcption e) {
			System.out.println(e.getMessage());
		}
	}

	private static int readAge() throws ReadAgeExcption{ //예외처리 시키고 위로던진다
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age<0)  //마이너스일떄만 예외처리
			throw new ReadAgeExcption();
		return age;
	}

}
