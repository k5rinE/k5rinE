package ex;

import java.util.Arrays;

public class ex09 {

	public static void main(String[] args) {
		String src = "ABCDE";
				
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i); 			//src의 i번째 문자를 ch에 저장
					System.out.println("src.charAt("+i+":"+ch);
		}
		//String을 char[]로 변환
		int[] num = {1, 2, 3};
		char[] chArr = src.toCharArray();
		
		String msg = "korea";
		chArr = msg.toCharArray();
		// char배열 char[])을 출력
		System.out.println(chArr);
		System.out.println(Arrays.toString(num));
	}

}
