package ex;
import java.util.Random;
import java.util.Scanner;

/* 요일 해당하는 영문 소문자 입력하기
 * 
 * 일 월 화 수 목 토 일  --> 랜덤하게 이 중 하나가 나오면
 * 그에 맞는 소문자로 요일 입력  --> sunday, monday, tuesday, wedensday, thursday, firday, saturday
 *  ==> 보충 : 5월(10(java)>>클래스(상속,인터페이스,다형성), 6월(10), 7월(10)
 */
public class ex04 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] DayKor = {"일","월","화","수","목","금","토"};
		String[] DayEng = { "sunday", "monday", "tuesday", "wednesday",
							"thursday", "friday", "satursday" 
						  };
		
		int retry=0;
		int last = -1;
		int count1= 0; int count2 = 0;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day==last);
			last = day;  // 최종요일 저장된 상태
			
			while(true) {
				System.out.println(DayKor[day] + "요일 : ");
				String dayeng = sc.nextLine();
				 
				if( dayeng.equals(DayEng[day]) ) break;
				count2++;
				System.out.println("오답입니다. 재입력해주세요!");
			}
			System.out.println("정답입니다. 재시도(1)/포기(0) : ");
			retry = sc.nextInt();
			sc.nextLine();  //엔터 제거용
			count1++;
		}while(retry==1);
		
		System.out.printf("성공%d : 실패%d 횟수: " , count1, count2);
		System.out.println("프로그램 종료!!");
	}

}