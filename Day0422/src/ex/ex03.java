package ex;
import java.util.*;
//일 월 화 수 목 토 일  랜덤하게 이중하나가 나오면 
//그에 맞는 소문자로 요일 입력 
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//String day = sc.nextLine();
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		String[] en = {"sun", "mon", "tue", "wed", "thu", "fir", "sat"};
		System.out.println("요일");
		
		int retry = 0;
		int last = -1;	 //이전 월
		
		do {
			
			int dayString =(int) (Math.random()*7);
		while(day == en);
		
			while(true) {
				System.out.print((day[dayString])+ "요일: ");
				String qus = sc.nextLine();
					if(qus.equals(en[dayString])) break;  //정답
				System.out.println("오답입니다.");
				
			}
			System.out.println("정답입니다 >> 재도전(1) : 그만(0)");
			retry = sc.nextInt();
			sc.nextLine();
		}while(retry ==1);
		System.out.println("프로그램 종료");
	}



	
	}


