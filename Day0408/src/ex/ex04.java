package ex;

public class ex04 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저항하기 위한 변수
		
		for (int i = 1; i<=10; i++) { //100 같이 자리수 넘어가는경우도 해볼것
			sum += i; // sum = sum + i;
			System.out.printf(" 1부터 %2d 까지의합 %2d%n", i, sum);
		}
		
	System.out.println("--------------------------");
	sum = 0;
	for (int i = 1; i<=10; i++) {

		sum += i; // sum = sum + i
		System.out.println("1부터" + i + " 까지의 합: " + sum);
		}
	}

}
