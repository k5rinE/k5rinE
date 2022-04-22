package ex;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] monthString = {
								"January", "February", "March", "April", "May", "June",
								"July", "August", "September", "October", "November", "December"
								};
		System.out.println("해당 월의 영어 단어를 입력하세요.");
		System.out.println("첫 글자는 대문자, 그이후는 소문자로 입력.");
		
		int retry = 0;
		int last = -1;	 //이전 월
		
		do {
			
			int month =(int) (Math.random()*12);
		while(month == last);
		last = month;
			while(true) {
				System.out.print((month+1)+ "월 : ");
				String qus = sc.nextLine();
					if(qus.equals(monthString[month])) break;  //정답
				System.out.println("오답입니다.");
				
			}
			System.out.println("정답입니다 >> 재도전(1) : 그만(0)");
			retry = sc.nextInt();
			sc.nextLine();
		}while(retry ==1);
		System.out.println("프로그램 종료");
	}

}
