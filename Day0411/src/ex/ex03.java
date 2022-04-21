package ex;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
int num , sum = 0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in); 
System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

	while(flag) {   // flag의 값이 트루이므로 조건식은 참이된다
	System.out.println(">>");
	
	String tmp = scanner.nextLine();  			//화면을 통해 입력받은 내용을 tep에 저장
	num=Integer.parseInt(tmp);					// 입력받은 문자열을 tmp에 저장

	if(num !=0) {
		sum +=num; // num이 0이아니면 sum에 더한다
	}else {
		flag = false; // num 이 0이면, flag의 값을  false로 변경.
		
	}
	System.out.println("합계:"+sum);
}

	

	}

}