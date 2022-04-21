package ex;

public class ex18 {

	public static void main(String[] args) {

		
		int[] coinUnit = {500, 100,50,10};  //동전최적화  100원짜리 10개 고정으로 값뽑아내기 해보자
		int money = 2680;
		
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int num = money/coinUnit[i];
			money %= coinUnit[i];
			
		System.out.println(coinUnit[i]+ "원 : " + num + "개");
		}

	}

	}
