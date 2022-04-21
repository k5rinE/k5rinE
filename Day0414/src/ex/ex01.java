package ex;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {

	      // 정수형 배열 5개 선언
	      // 초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		// 배열은 0 부터 시작
	      int[] num = new int[5];

	      for (int i = 0; i < num.length; i++) {
	         num[i] = (int)(Math.random() *100) + 1;
	      }
	      System.out.println(Arrays.toString(num));

	      num = sort(num);

	      System.out.println(Arrays.toString(num));
	   }

	   public static int[] sort(int[] num) {
	      for (int i = 0; i < num.length; i++) {
	         for (int j = i+1; j < num.length; j++) {
	            if(num[i] > num[j]) {
	               int min = num[i];
	               num[i] = num[j];
	               num[j] = min;
	            }
	         }
	      }
	      return num;
	   }
	   
	}


//