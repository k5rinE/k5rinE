package ex;

public class ex16 {

	public static void main(String[] args) {

		
		int[] coinUnit = { 500, 100,50,10};
		int money = 2680;
		System.out.println("money=" + money);
		
	
		for(int i=0; i<coinUnit.length; i++) {
			coinUnit[i]++;
		}
			for(int i=0; i<coinUnit.length; i++) {
			System.out.println(i+ "의 개수"+coinUnit[i]);
		}
	}

}
