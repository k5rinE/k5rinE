package ex;
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
 //숫자만 입력하고, 2자리 정수를 입력하기 전까지 무한 반복
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		System.out.println("두 자리 점수를 입력하세요");
		
		do {		  //최소 한번실행한다 명령어
			System.out.println("입력 >>");
			num = sc.nextInt();
		}while(num<10 || num>99);
		
		System.out.println(num);
		
	}

}
