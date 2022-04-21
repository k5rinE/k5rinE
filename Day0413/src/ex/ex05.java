package ex;

import java.util.Arrays;

public class ex05 {

	public static void main(String[] args) {

		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)를 만든다
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc,  0 , result,  0,  abc.length);
		System.arraycopy(num,  0 , result,  abc.length, num.length);
		System.out.println(result);
		
		//배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이 만큼 복사
		System.arraycopy(abc,  0 , num,  0,  abc.length);
		System.out.println(num);
		
		//number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc,  0 , num, 6, 3);
		System.out.println(num);
				
		System.out.println("----------------------------");
		
		int[] ee = {10,20,30,40,50};
		int[] ee2 = {1,2,3,4,5,6,7,8,9};  // -> int ee2 = {1 2 30 40 50 6789}로 바꺼라 
		
		System.out.println(ee);
		System.out.println(ee2);
		
		System.out.println(Arrays.toString(ee));
		System.out.println(Arrays.toString(ee2));
		
		System.arraycopy(ee, 2, ee2, 2, 3);
		System.out.println(Arrays.toString(ee2));
		}


	}


