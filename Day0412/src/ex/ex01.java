package ex;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		int sum=0;
        Scanner sc = new Scanner(System.in);
        
        while(true){
           System.out.println("숫자입력(종료:0) : ");
           
           String tmp = sc.nextLine();
           int num = Integer.parseInt(tmp);
            //int num = se.nextInt();->
           if (num == 0) break;

           System.out.println("사칙연산 기호  : ");
           String str = sc.nextLine();
           char ch = str.charAt(0);  
           
           switch(ch) {
           case '+' :
              sum +=num;
              break;
           case '*' :
              sum *=num;
              break;
           case '/' :
              sum /=num;
              break;
           case '-' :
              sum -=num;
              break;
           default :
              System.out.println("+ * - / 중 하나를 입력하세요");
           }
        }
        System.out.println(sum);
	}

}
