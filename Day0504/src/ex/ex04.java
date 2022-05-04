package ex;

public class ex04 {

	class Card{
		String kind;
		int number;
	}
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Kind : "+ kind + ", number : " + number;
	}
	
}

	public static void main(String[] args) {
		
Card c1 = new Card("red", 10);
Card c2 = new Card;

	System.out.println(c1);
	System.out.println(c2.toString());

	Date today = new Date();
	System.out.println(today);
	}

}
