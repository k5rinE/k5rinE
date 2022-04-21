package ex;
import java.util.*;
public class ex08 {

	public static void main(String[] args) {
		
		
		System.out.println("[사용자로부터 사칙연산자 +, -, *, / 값을 입력 받은 후 연산 수행 실시]");			
		
		//사용자로부터 데이터를 입력 받기 위해 Scanner 객체 선언
		Scanner scan = new Scanner(System.in); 
		
		//첫번째, 두번째 정수를 입력받는다
		System.out.print("첫 번째 값 : ");
		int one = scan.nextInt();
		
		System.out.print("두 번째 값 : ");
		int two = scan.nextInt(); 
				
		//기호를 입력받는다
		System.out.print("(+, -, *, /) 중 연산자를 선택해 주세요 : ");
		String sign = scan.next();
		
		if(sign.equals("+")) {
			System.out.println("연산 : "+one+" + "+two+" = "+(one+two));
		}
		else if(sign.equals("-")) {
			System.out.println("연산 : "+one+" - "+two+" = "+(one+two));
		}
		else if(sign.equals("*")) {
			System.out.println("연산 : "+one+" * "+two+" = "+(one+two));
		}
		else if(sign.equals("/")) {
			System.out.println("연산 : "+one+" / "+two+" = "+(one+two));
		}
		else {
			System.out.println("선택한 연산자가 적절하지 않습니다 ... 다시 선택해 주세요");
		}

	}//메인 종료

}//클래스 종료
		



