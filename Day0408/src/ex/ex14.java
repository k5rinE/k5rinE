package ex;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		 int num = 0;
		 
		 System.out.println("*을 출력할 라인의 수를 입력하세요.>");
		 
		 Scanner scanner = new Scanner(System.in);
		 String tmp = scanner.nextLine();
		 num = Integer.parseInt(tmp);
		 
		 
		 for (int i=0; i<num; i++) {
			 for(int j=0; j<=i;j++) {
				 System.out.print("*"); //println //print 구분
				 							//기초편에 언급이 안된건 넘겨라
				 							//기초편위주로 공부
			 }
				 
				 System.out.println();
				 
		 }
		 
		
	}

}
