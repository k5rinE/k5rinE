package ex;

public class ex07 {

	public static void main(String[] args) { // 20까지 수중 
											//2 3배수를 제외한 총합
		int sum = 0; //합계를 저장하기 위한 변수

		//boolean flag = true;
				
			for(int i=1; i<=20; i++) {
				
				if (i%2 !=0 && i%3 !=0)
			sum += i; //sum = sum+i
				
		
		System.out.println("sum : " + sum);
			}
	}

}
