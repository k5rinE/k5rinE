package ex;
import java.util.*;
public class ex06 {

			static int[][] mdays = {
					{31, 28, 31, 30, 31, 31, 30, 31, 30, 31},
					{31, 29, 31, 30, 31, 31, 30, 31, 30, 31}
			};
			
			static int isLeap(int year) {
				return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
				}
			
			static int dayOfYear (int year, int month, int day) {
				
				int days = day;
				for(int i=1; i<month; i++)
					days += mdays[isLeap(year)][i-1];
				//days += mdays[0][0];
				return days;
			}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int re = 0;
	System.out.println(" 그해 결과 일수를 구한다");
	do {
		System.out.print("년 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		System.out.print("일 입력: ");
		int day = sc.nextInt();
		System.out.printf("그 해 %d일째 날입니다.\n", dayOfYear(year, month, day));
		
		System.out.println("반복(yes(1)/No(0))");
		re = sc.nextInt();
		
		}while(re==1);
	}
}