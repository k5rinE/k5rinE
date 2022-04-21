package ex;

public class ex17 {

	public static void main(String[] args) {

		
		int[] coinUnit = {500, 100,50,10};
		int money = 2680;
		
		System.out.println("money=" + money);
		
	
	int num500 = money/coinUnit[0];{
		System.out.println("500원 :" + num500);}
		int num100 = money/coinUnit[1];{
		System.out.println("100원 :" + num100);}
		int num50 = money/coinUnit[2];{
		System.out.println("50원 :" + num50);}
		int num10 = money/coinUnit[3];{
		System.out.println("10원 :" + num10);}
		
	int mon = money/coinUnit[0];{
		System.out.println("나머지: " + mon);}
	
		
		for(int i=0; i<coinUnit.length; i++) {
		 coinUnit[0]++;
		}
			for(int i=0; i<coinUnit.length; i++) {
		System.out.println(i+ "의 개수"+coinUnit[i]);
		}
	}

	}
