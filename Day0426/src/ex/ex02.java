package ex;


public class ex02 {

	public static void main(String[] args) {
	SutdaCard card1 = new SutdaCard(3, false);
	SutdaCard card2 = new SutdaCard();
	
	System.out.println(card1.info());
	System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}
	
	public SutdaCard(int num, boolean isKwang) {
		if(num>=1 && num<=10)
			this.num = num;
		else
			this.num = 0;
		
		
		this.isKwang = isKwang;
	}
String info() {
	//return num + (isKwang == true? "k" : "");
	return num + (isKwang? "k" : "");
}
}
	