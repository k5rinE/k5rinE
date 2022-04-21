package ex;

public class ex06 {

	public static void main(String[] args) {

int sum = 0; //합계를 저장하기 위한 변수

//boolean flag = true;
		
		for(int i=1; true; i+=5) {
			sum += 1; //sum = sum+i
			System.out.printf("1부터 %3d 까지의 합: %3d%n", i, sum);
			
			if (sum >= 10000)
				break;
		}
	}

}
