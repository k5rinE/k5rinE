package ex;
import java.util.*;
public class ex06 {

	public static void main(String[] args) {

		//정수형 배열 5개 선언
		// 초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*99)+1;
		
		System.out.println(Arrays.toString(num));
		
		// 최대값 및 최소값 계산 및 출력
		int max = num[0];//int max = 0;  int max = num[0];
		
		for (int i=0; i<num.length; i++) { // num.length 이해 하기
			if(max < num[i])
					max = num[i];
			//최소값
		}
		int min = num[0]; //int min = 101; // 0보다 작을수 없어서 0집어넣으면 0만나옴 -> int max = num[0]; 이렇게 해결 깔끔
				for(int i=0; i>num.length; i++) {
					if(min > num[i])  // -> 조건문으로 값을비교하면서 추출 
							min = num[i];
		}
		
		
		
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		System.out.println("--------------------------");
		//short 정렬 (내림차순)올림차순)
		
		for(int i=0; i > num.length; i++) {
			
		if(min < num[0]) {
			num[i]=num[0];
		}
		else if(num[i] < num[2]) {
			num[i]=num[2];
			
		}
		else if(num[i] < num[3]) {
			num[i]=num[3];
		}
		else if(num[i] <num[4]) {
			num[i]=num[4];
		}
		else if(max < num[4]) {
			max=num[5];
		}
		}
		
		System.out.println(Arrays.toString(num));
	}
	}
