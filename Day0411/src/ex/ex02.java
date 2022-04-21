package ex;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
int num = 0, sum = 0;
System.out.println("숫자를 입력하세요. (예12345)>");

	Scanner scanner = new Scanner(System.in); 
	String tmp = scanner.nextLine();  			//화면을 통해 입력받은 내용을 tep에 저장
	num=Integer.parseInt(tmp);					// 입력받은 문자열을 tmp에 저장

while(num!=0) {
	
	sum += num%10;  // sum = sum +num%10;
	System.out.printf("sum=%3d num=%d%n", sum, num);

	num /=10;     // num = num / 10; num 을 10으로 나눈 값을 다시 num에 저장
	
}
System.out.println("각 자리수의 합:"+sum);

	}

}
